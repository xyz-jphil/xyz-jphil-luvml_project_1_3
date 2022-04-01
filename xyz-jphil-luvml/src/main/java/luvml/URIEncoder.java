/*
 * Copyright 2021 Ivan Velikanova ivan.velikanova@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package luvml;

import luvml.o.Out_I;

/**
 * Refer
 * https://stackoverflow.com/questions/607176/java-equivalent-to-javascripts-encodeuricomponent-that-produces-identical-outpu
 *
 * @author
 */
public class URIEncoder {

    private static final String HEX = "0123456789ABCDEF";

    public static String encodeURIComponent(String str) {
        if (str == null) {
            return null;
        }

        byte[] bytes = null;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (Exception e) {
            return null;
        }

        StringBuilder builder = new StringBuilder(bytes.length);

        for (byte c : bytes) {
            if (c >= 'a' ? c <= 'z' || c == '~'
                    : c >= 'A' ? c <= 'Z' || c == '_'
                            : c >= '0' ? c <= '9' : c == '-' || c == '.') {
                builder.append((char) c);
            } else {
                builder.append('%')
                        .append(HEX.charAt(c >> 4 & 0xf))
                        .append(HEX.charAt(c & 0xf));
            }
        }

        return builder.toString();
    }

    public static String decodeURIComponent(String str) {
        if (str == null) {
            return null;
        }

        int length = str.length();
        byte[] bytes = new byte[length / 3];
        StringBuilder builder = new StringBuilder(length);

        for (int i = 0; i < length;) {
            char c = str.charAt(i);
            if (c != '%') {
                builder.append(c);
                i += 1;
            } else {
                int j = 0;
                do {
                    char h = str.charAt(i + 1);
                    char l = str.charAt(i + 2);
                    i += 3;

                    h -= '0';
                    if (h >= 10) {
                        h |= ' ';
                        h -= 'a' - '0';
                        if (h >= 6) {
                            throw new IllegalArgumentException();
                        }
                        h += 10;
                    }

                    l -= '0';
                    if (l >= 10) {
                        l |= ' ';
                        l -= 'a' - '0';
                        if (l >= 6) {
                            throw new IllegalArgumentException();
                        }
                        l += 10;
                    }

                    bytes[j++] = (byte) (h << 4 | l);
                    if (i >= length) {
                        break;
                    }
                    c = str.charAt(i);
                } while (c == '%');
                
                try {
                    builder.append(new String(bytes, 0, j, "UTF-8"));
                } catch (Exception e) {
                    return null;
                }
            }
        }

        return builder.toString();
    }
    
    public static void encode_data(String mime, ___F data, Out_I out){
        out.__("data:").__(mime).__(",");
        data.writeTo(out);
    }

}
