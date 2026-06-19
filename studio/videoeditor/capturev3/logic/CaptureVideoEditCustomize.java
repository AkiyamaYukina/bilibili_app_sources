package com.bilibili.studio.videoeditor.capturev3.logic;

import L50.a;
import Pb.E;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.collection.LruCache;
import androidx.compose.ui.autofill.r;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.D;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.gamemaker.GameSchemeBean;
import com.bilibili.studio.videoeditor.help.compiler.sdk.i;
import com.bilibili.studio.videoeditor.util.V;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import mw0.C8045a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/CaptureVideoEditCustomize.class */
@Keep
public class CaptureVideoEditCustomize extends D {
    public CaptureVideoEditCustomize(Context context) {
        super(context);
    }

    private boolean upZipFile(String str, String str2) {
        try {
            ZipFile zipFile = new ZipFile(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            byte[] bArr = new byte[1024];
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.getName().contains("MACOSX")) {
                    if (zipEntryNextElement.isDirectory()) {
                        StringBuilder sbA = r.a(str2);
                        sbA.append(zipEntryNextElement.getName());
                        String string = sbA.toString();
                        string.getClass();
                        new File(string).mkdir();
                    } else {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(getRealFileName(str2, zipEntryNextElement.getName())));
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                            while (true) {
                                int i7 = bufferedInputStream.read(bArr, 0, 1024);
                                if (i7 == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i7);
                            }
                            bufferedInputStream.close();
                            bufferedOutputStream.close();
                        } catch (FileNotFoundException | IOException e7) {
                            return false;
                        }
                    }
                }
            }
            try {
                zipFile.close();
                return true;
            } catch (IOException e8) {
                return false;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public String getFileByExtension(String str, String str2) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                if (file.getPath().substring(file.getPath().length() - str2.length()).equals(str2)) {
                    return file.getPath();
                }
            } else if (file.isDirectory()) {
                String fileByExtension = getFileByExtension(file.getAbsolutePath(), str2);
                if (!TextUtils.isEmpty(fileByExtension)) {
                    return fileByExtension;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public File getRealFileName(String str, String str2) {
        String strReplace = str2.replace("\\", "/");
        String[] strArrSplit = strReplace.split("/");
        File file = new File(str);
        if (strArrSplit.length <= 1) {
            return new File(file, strReplace);
        }
        for (int i7 = 0; i7 < strArrSplit.length - 1; i7++) {
            file = new File(file, strArrSplit[i7]);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, strArrSplit[strArrSplit.length - 1]);
    }

    @Override // com.bilibili.studio.videoeditor.D
    public void onConverted2BClipFinish(EditVideoInfo editVideoInfo, List<BClip> list) {
        String filePath;
        int iLastIndexOf;
        String string;
        if (editVideoInfo == null || V.e(list)) {
            return;
        }
        BClip bClip = list.get(0);
        if (!V.e(editVideoInfo.getBiliEditorStickerInfoList())) {
            BiliEditorStickerInfo biliEditorStickerInfo = editVideoInfo.getBiliEditorStickerInfoList().get(0);
            biliEditorStickerInfo.setClipId(bClip.id);
            biliEditorStickerInfo.setClipPath(bClip.videoPath);
            biliEditorStickerInfo.setTrimInClip(0L);
            EditFxSticker editFxSticker = biliEditorStickerInfo.getEditFxSticker();
            if (editFxSticker != null && !TextUtils.isEmpty(editFxSticker.getFilePath()) && (iLastIndexOf = (filePath = editFxSticker.getFilePath()).lastIndexOf("/")) > 0) {
                String strSubstring = filePath.substring(0, iLastIndexOf);
                upZipFile(filePath, strSubstring);
                String fileByExtension = getFileByExtension(strSubstring, ".animatedsticker");
                String fileByExtension2 = getFileByExtension(strSubstring, ".lic");
                if (!TextUtils.isEmpty(fileByExtension)) {
                    editFxSticker.setFilePath(fileByExtension);
                    LruCache<String, Pair<String, String>> lruCache = C8045a.f123886a;
                    C8045a.d(editFxSticker.getId(), fileByExtension, editFxSticker.getName());
                    L50.a aVar = a.a.a;
                    if ((aVar.a != null ? R50.r.u() : null) != null) {
                        StringBuilder sb = new StringBuilder();
                        R50.r rVarU = aVar.a != null ? R50.r.u() : null;
                        int iInstallAssetPackage = (rVarU != null ? rVarU.t() : null).a.installAssetPackage(fileByExtension, fileByExtension2, 3, true, sb);
                        C8045a.c(3, fileByExtension, fileByExtension2, sb);
                        if (iInstallAssetPackage == 0 || iInstallAssetPackage == 2) {
                            string = sb.toString();
                        } else {
                            BLog.e("AssetPackageUtil", "install sticker asset package " + fileByExtension + " fail, error code: " + iInstallAssetPackage);
                            string = null;
                        }
                    } else {
                        E.a("install sticker asset package ", fileByExtension, " fail: stream context is null!", "AssetPackageUtil");
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        editFxSticker.setFxId(string);
                    }
                }
            }
        }
        if (V.e(editVideoInfo.getCaptionInfoList())) {
            return;
        }
        editVideoInfo.getCaptionInfoList().get(0).bClipID = bClip.id;
    }

    @Override // com.bilibili.studio.videoeditor.D
    public boolean onEditVideoFinish(EditVideoInfo editVideoInfo, boolean z6) {
        Context editContext = getEditContext() != null ? getEditContext() : getContext();
        if (!z6) {
            eC0.d.a(editContext, editVideoInfo, isNewUI(), (GameSchemeBean) null);
            return true;
        }
        eC0.d.b(editContext, editVideoInfo, isNewUI(), (GameSchemeBean) null);
        com.bilibili.studio.videoeditor.help.compiler.sdk.i iVarA = i.a.a(getContext().getApplicationContext());
        iVarA.c(editVideoInfo.getMuxInfo(getContext()));
        iVarA.h();
        return true;
    }

    @Override // com.bilibili.studio.videoeditor.D
    public boolean supportClipAddMore() {
        return true;
    }
}
