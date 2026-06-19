package com.bilibili.studio.kaleidoscope.adapter.support;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.text.font.C4496a;
import androidx.exifinterface.media.ExifInterface;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.Size;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/support/SupportAVFileInfo.class */
public final class SupportAVFileInfo implements AVFileInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f108380a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/support/SupportAVFileInfo$a.class */
    public static class a implements AVFileInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f108381a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108382b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public iA0.b f108383c;

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final Object getAVFileInfo() {
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final boolean getAudioStreamCodecSupport(int i7) {
            return false;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getAudioStreamCount() {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public long getAudioStreamDuration(int i7) {
            return 0L;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getAudioStreamSampleRate(int i7) {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final long getDataRate() {
            return 0L;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public long getDuration() {
            return 0L;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamCodecType(int i7) {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamColorTranfer(int i7) {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamComponentBitCount(int i7) {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamCount() {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        @NonNull
        public Size getVideoStreamDimension(int i7) {
            return new iA0.b(0, 0);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public long getVideoStreamDuration(int i7) {
            return 0L;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.kaleidoscope.sdk.Rational, iA0.a, java.lang.Object] */
        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        @NonNull
        public final Rational getVideoStreamFrameRate(int i7) {
            ?? obj = new Object();
            ((iA0.a) obj).a = 0;
            ((iA0.a) obj).b = 0;
            return obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public int getVideoStreamRotation(int i7) {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final void setAVFileInfo(Object obj) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/support/SupportAVFileInfo$b.class */
    public static final class b extends a {
        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getAVFileType() {
            return 1;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final long getAudioStreamDuration(int i7) {
            return this.f108381a;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final long getDuration() {
            return this.f108381a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/support/SupportAVFileInfo$c.class */
    public static final class c extends a {
        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getAVFileType() {
            return 2;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        @NonNull
        public final Size getVideoStreamDimension(int i7) {
            return this.f108383c;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamRotation(int i7) {
            return this.f108382b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/support/SupportAVFileInfo$d.class */
    public static final class d extends a {
        @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getAVFileType() {
            return 0;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final long getDuration() {
            return this.f108381a;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        @NonNull
        public final Size getVideoStreamDimension(int i7) {
            return this.f108383c;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final long getVideoStreamDuration(int i7) {
            return this.f108381a;
        }

        @Override // com.bilibili.studio.kaleidoscope.adapter.support.SupportAVFileInfo.a, com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
        public final int getVideoStreamRotation(int i7) {
            return this.f108382b;
        }
    }

    public SupportAVFileInfo(@NonNull String str) {
        String strProbeContentType;
        File file = new File(str);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                strProbeContentType = Files.probeContentType(file.toPath());
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } else {
            strProbeContentType = null;
        }
        String mimeTypeFromExtension = strProbeContentType;
        if (strProbeContentType == null) {
            String name = file.getName();
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(name.lastIndexOf(46) + 1));
            if (mimeTypeFromExtension == null) {
                throw new RuntimeException(C4496a.a("Can't find MimeType for ", str));
            }
        }
        int i7 = 0;
        long j7 = 0;
        if (mimeTypeFromExtension.startsWith("video")) {
            a aVar = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                aVar.f108381a = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) * 1000 : j7;
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                int i8 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                if (i8 == 0) {
                    aVar.f108382b = 0;
                } else if (i8 == 90) {
                    aVar.f108382b = 1;
                } else if (i8 == 180) {
                    aVar.f108382b = 2;
                } else if (i8 == 270) {
                    aVar.f108382b = 3;
                }
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                int i9 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(19);
                aVar.f108383c = new iA0.b(i9, strExtractMetadata4 != null ? Integer.parseInt(strExtractMetadata4) : i7);
                this.f108380a = aVar;
                return;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
        if (mimeTypeFromExtension.startsWith("audio")) {
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                mediaMetadataRetriever2.setDataSource(str);
                String strExtractMetadata5 = mediaMetadataRetriever2.extractMetadata(9);
                aVar2.f108381a = strExtractMetadata5 != null ? Long.parseLong(strExtractMetadata5) * 1000 : j7;
                this.f108380a = aVar2;
                return;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
        if (!mimeTypeFromExtension.startsWith("image")) {
            throw new RuntimeException(C4496a.a("Can't find MimeType for ", str));
        }
        a aVar3 = new a();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        aVar3.f108383c = new iA0.b(options.outWidth, options.outHeight);
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 1) {
                aVar3.f108382b = 0;
            } else if (attributeInt == 3) {
                aVar3.f108382b = 2;
            } else if (attributeInt == 6) {
                aVar3.f108382b = 1;
            } else if (attributeInt == 8) {
                aVar3.f108382b = 3;
            }
            this.f108380a = aVar3;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Nullable
    public static AVFileInfo get(String str) {
        try {
            if (str.length() <= 0) {
                return null;
            }
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                return new SupportAVFileInfo(str);
            }
            return null;
        } catch (Exception e7) {
            return null;
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public Object getAVFileInfo() {
        return null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAVFileType() {
        return this.f108380a.getAVFileType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public boolean getAudioStreamCodecSupport(int i7) {
        return false;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAudioStreamCount() {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getAudioStreamDuration(int i7) {
        return 0L;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getAudioStreamSampleRate(int i7) {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getDataRate() {
        return 0L;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getDuration() {
        return this.f108380a.getDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamCodecType(int i7) {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamColorTranfer(int i7) {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamComponentBitCount(int i7) {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamCount() {
        return 0;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    @NonNull
    public Size getVideoStreamDimension(int i7) {
        return this.f108380a.getVideoStreamDimension(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public long getVideoStreamDuration(int i7) {
        return this.f108380a.getVideoStreamDuration(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    @NonNull
    public Rational getVideoStreamFrameRate(int i7) {
        return null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public int getVideoStreamRotation(int i7) {
        return this.f108380a.getVideoStreamRotation(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AVFileInfo
    public void setAVFileInfo(Object obj) {
    }
}
