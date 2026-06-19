package com.bilibili.live.streaming;

import com.bilibili.live.streaming.sources.SceneSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/SceneUtils.class */
public final class SceneUtils {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/SceneUtils$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SceneSource initSceneSource(@NotNull AVContext aVContext, @NotNull InputStream inputStream) throws Exception {
            InputStreamReader inputStreamReader = null;
            try {
                try {
                    InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader2);
                        StringBuilder sb = new StringBuilder();
                        for (String line = bufferedReader.readLine(); line != null && line.length() != 0; line = bufferedReader.readLine()) {
                            sb.append(line);
                        }
                        inputStreamReader2.close();
                        SceneSource sceneSource = (SceneSource) FilterFactory.inst().deserializeFilter(aVContext, new JSONObject(sb.toString()));
                        inputStreamReader2.close();
                        return sceneSource;
                    } catch (Exception e7) {
                        e = e7;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        throw th;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Nullable
        public final SceneSource initSceneSource(@NotNull AVContext aVContext, @NotNull String str) throws Exception {
            File file = new File(str);
            FileInputStream fileInputStream = null;
            try {
                try {
                    if (!file.getParentFile().exists()) {
                        throw new Exception("scene filepath is null");
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        SceneSource sceneSourceInitSceneSource = initSceneSource(aVContext, fileInputStream2);
                        fileInputStream2.close();
                        return sceneSourceInitSceneSource;
                    } catch (Exception e7) {
                        e = e7;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final boolean saveSceneSource(@NotNull String str, @Nullable SceneSource sceneSource) throws Throwable {
            if (sceneSource == null) {
                return false;
            }
            File file = new File(str);
            FileWriter fileWriter = null;
            try {
                try {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    FileWriter fileWriter2 = new FileWriter(str, false);
                    try {
                        fileWriter2.write(FilterFactory.inst().serializeFilter(sceneSource).toString());
                        fileWriter2.close();
                        fileWriter2.close();
                        return true;
                    } catch (IOException e7) {
                        e = e7;
                        fileWriter = fileWriter2;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e = e8;
                fileWriter = null;
            }
        }
    }
}
