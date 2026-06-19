package com.bilibili.lib.v8.spdlog;

import android.content.Context;
import androidx.fragment.app.D;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/spdlog/SpdLog.class */
public class SpdLog implements BaseLog {
    private static final String LOG_FILE_NAME = "miniapp_log_v1";
    private static Map<String, SpdLog> spdLogs = new HashMap();
    private String appId;
    private Boolean isSupported;
    private File logDir;
    private Boolean tracingEnable;

    private SpdLog(Context context, String str, boolean z6) {
        Boolean bool = Boolean.TRUE;
        this.isSupported = bool;
        this.tracingEnable = bool;
        this.appId = str;
        this.logDir = context.getDir(LOG_FILE_NAME, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.logDir.getAbsolutePath());
        try {
            initSpdLog(str, D.a(File.separator, str, ".log", sb), z6);
        } catch (Throwable th) {
            this.isSupported = Boolean.FALSE;
        }
    }

    public static native void debug(String str, String str2);

    public static native void drop(String str);

    public static SpdLog getInstance(Context context, String str, boolean z6) {
        SpdLog spdLog = spdLogs.get(str);
        SpdLog spdLog2 = spdLog;
        if (spdLog == null) {
            synchronized (spdLogs) {
                SpdLog spdLog3 = spdLogs.get(str);
                spdLog2 = spdLog3;
                if (spdLog3 == null) {
                    spdLog2 = new SpdLog(context, str, z6);
                    spdLogs.put(str, spdLog2);
                }
            }
        }
        return spdLog2;
    }

    private File[] getLogFiles() {
        return this.logDir.listFiles(new FileFilter(this) { // from class: com.bilibili.lib.v8.spdlog.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpdLog f65053a;

            {
                this.f65053a = this;
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return this.f65053a.lambda$getLogFiles$0(file);
            }
        });
    }

    public static native void info(String str, String str2);

    public static native void initSpdLog(String str, String str2, boolean z6);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$getLogFiles$0(File file) {
        return file.isFile() && file.getName().contains(this.appId);
    }

    public static native void log(String str, String str2);

    private boolean supportedTracing() {
        return this.isSupported.booleanValue() && this.tracingEnable.booleanValue();
    }

    public static native void sys(String str, String str2);

    public static native void warn(String str, String str2);

    private void zipFile(File[] fileArr, ZipOutputStream zipOutputStream, String str) throws Throwable {
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            int length = fileArr.length;
            int i7 = 0;
            while (i7 < length) {
                File file = fileArr[i7];
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    while (true) {
                        int i8 = fileInputStream3.read(bArr);
                        if (i8 > 0) {
                            zipOutputStream.write(bArr, 0, i8);
                        }
                    }
                    i7++;
                    fileInputStream2 = fileInputStream3;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream3;
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
            fileInputStream = fileInputStream2;
            zipOutputStream.closeEntry();
            try {
                zipOutputStream.close();
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void debug(String str) {
        if (supportedTracing()) {
            debug(this.appId, str);
        }
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void drop() {
        if (this.isSupported.booleanValue()) {
            drop(this.appId);
        }
    }

    public File getZippedLogFile() throws Throwable {
        File[] logFiles;
        if (!supportedTracing() || (logFiles = getLogFiles()) == null || logFiles.length <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.logDir);
            String str = File.separator;
            sb.append(str);
            sb.append(this.appId);
            sb.append("_");
            sb.append(System.currentTimeMillis());
            sb.append(".zip");
            File file = new File(sb.toString());
            zipFile(logFiles, new ZipOutputStream(new FileOutputStream(file)), LogReportStrategy.TAG_DEFAULT + str);
            return file;
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void info(String str) {
        if (supportedTracing()) {
            info(this.appId, str);
        }
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void log(String str) {
        if (supportedTracing()) {
            log(this.appId, str);
        }
    }

    public SpdLog logSetting(String str) {
        try {
            boolean z6 = true;
            if (Integer.parseInt(str) != 1) {
                z6 = false;
            }
            this.tracingEnable = Boolean.valueOf(z6);
        } catch (NumberFormatException e7) {
            this.tracingEnable = Boolean.TRUE;
        }
        return this;
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void sys(String str) {
        if (supportedTracing()) {
            sys(this.appId, str);
        }
    }

    @Override // com.bilibili.lib.v8.spdlog.BaseLog
    public void warn(String str) {
        if (supportedTracing()) {
            warn(this.appId, str);
        }
    }
}
