package com.bilibili.mediastreaming;

import Tm0.a;
import android.os.Build;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/BiliPushDevice.class */
public final class BiliPushDevice {

    @NotNull
    public static final BiliPushDevice INSTANCE = new BiliPushDevice();

    @NotNull
    public final String getCPUName() throws Throwable {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String strSubstring;
        FileReader fileReader2 = null;
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                fileReader.close();
                                break;
                            }
                            if (StringsKt.n(line, "Hardware")) {
                                String[] strArr = (String[]) new Regex(":").split(line, 0).toArray(new String[0]);
                                if (strArr.length < 2) {
                                    strSubstring = Build.HARDWARE;
                                    break;
                                }
                                String str = strArr[1];
                                int length = str.length();
                                int length2 = str.length();
                                int i7 = 0;
                                for (int i8 = 0; i8 < length2 && str.charAt(i8) == ' '; i8++) {
                                    i7++;
                                }
                                int i9 = length - 1;
                                int i10 = length;
                                if (i7 <= i9) {
                                    while (true) {
                                        i10 = length;
                                        if (str.charAt(i9) != ' ') {
                                            break;
                                        }
                                        length--;
                                        i10 = length;
                                        if (i9 == i7) {
                                            break;
                                        }
                                        i9--;
                                    }
                                }
                                if (i7 != i10) {
                                    strSubstring = str.substring(i7, i10);
                                    break;
                                }
                            }
                        } catch (IOException e7) {
                            fileReader2 = fileReader;
                            if (fileReader2 != null) {
                                fileReader2.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return Build.HARDWARE;
                        } catch (Throwable th) {
                            th = th;
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception e8) {
                                    throw th;
                                }
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    fileReader.close();
                    bufferedReader.close();
                    return strSubstring;
                } catch (IOException e9) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (IOException e10) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileReader = null;
            }
        } catch (Exception e11) {
            return Build.HARDWARE;
        }
    }

    @NotNull
    public final String getDeviceDetail() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Manufacturer", getDeviceManufacturer());
        jSONObject.put(a.f24207d, getPhoneBrand());
        jSONObject.put("model", getPhoneModel());
        jSONObject.put("ID", getID());
        jSONObject.put("OSVersion", getPhoneOSVersion());
        String sOCModel = getSOCModel();
        String cPUName = sOCModel;
        if (sOCModel == null) {
            cPUName = getCPUName();
        }
        jSONObject.put("SOCModel", cPUName);
        jSONObject.put("deviceName", getDeviceName());
        return jSONObject.toString();
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    @NotNull
    public final String getDeviceName() {
        return Build.DEVICE;
    }

    @NotNull
    public final String getID() {
        return Build.ID;
    }

    @NotNull
    public final String getPhoneBrand() {
        return Build.BRAND;
    }

    @NotNull
    public final String getPhoneModel() {
        return Build.MODEL;
    }

    @NotNull
    public final String getPhoneOSVersion() {
        return Build.VERSION.RELEASE;
    }

    @Nullable
    public final String getSOCModel() {
        return Build.VERSION.SDK_INT >= 31 ? Build.SOC_MODEL : null;
    }
}
