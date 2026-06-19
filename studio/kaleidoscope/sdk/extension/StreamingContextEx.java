package com.bilibili.studio.kaleidoscope.sdk.extension;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.sdk.AudioResolution;
import com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.IconGenerator;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt;
import com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo;
import com.bilibili.studio.kaleidoscope.sdk.MediaFileConvertor;
import com.bilibili.studio.kaleidoscope.sdk.MediaFileVideoRetriever;
import com.bilibili.studio.kaleidoscope.sdk.PointD;
import com.bilibili.studio.kaleidoscope.sdk.Position2D;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.Size;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.VideoResolution;
import com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator;
import jA0.a;
import jA0.b;
import jA0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/extension/StreamingContextEx.class */
public interface StreamingContextEx {
    @NonNull
    AudioResolution createAudioResolution(int i7, int i8);

    @NonNull
    AudioSampleBuffers createAudioSampleBuffers();

    @NonNull
    a createCafCreator(Context context, String str, String str2, int i7, int i8, int i9, c cVar, c cVar2, int i10);

    @NonNull
    c createCafRational(int i7, int i8);

    @NonNull
    Color createColor(float f7, float f8, float f9, float f10);

    ControlPointPair createControlPointPair(PointD pointD, PointD pointD2);

    @NonNull
    b createGifDecoder();

    @NonNull
    IconGenerator createIconGenerator();

    LiveWindow createLiveWindow(Context context);

    LiveWindowExt createLiveWindowExt(Context context);

    MaskRegionInfo.RegionInfo createMaskRegionInfo(int i7);

    MaskRegionInfo.Ellipse2D createMaskRegionInfoEllipse2D(Position2D position2D, float f7, float f8, float f9);

    MaskRegionInfo.Transform2D createMaskRegionInfoTransform2D();

    @NonNull
    MediaFileConvertor createMediaFileConvertor();

    @NonNull
    MediaFileVideoRetriever createMediaFileVideoRetriever();

    PointD createPointD(double d7, double d8);

    Position2D createPosition2D(float f7, float f8);

    @NonNull
    Rational createRational(int i7, int i8);

    MaskRegionInfo createRegionInfo();

    @NonNull
    Size createSize(int i7, int i8);

    @Nullable
    StreamingContext.TemplateFootageInfo createTemplateFootageInfo();

    VideoResolution createVideoResolution();

    @NonNull
    VideoResolution createVideoResolution(int i7, int i8, int i9, Rational rational);

    @NonNull
    WaveformDataGenerator createWaveformDataGenerator();

    void setCheckEnableX(boolean z6);
}
