package com.bilibili.opengldecoder.utils;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/utils/RawResourceReader.class */
public class RawResourceReader {
    public static String readTextFileFromRawResource(Context context, int i7) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i7)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
                sb.append('\n');
            } catch (IOException e7) {
                return null;
            }
        }
    }
}
