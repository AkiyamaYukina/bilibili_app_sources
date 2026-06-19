package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateStatusOrBuilder.class */
public interface TfActivateStatusOrBuilder extends MessageLiteOrBuilder {
    String getCaptcha();

    ByteString getCaptchaBytes();

    String getFakeId();

    ByteString getFakeIdBytes();

    boolean getIsAuto();

    String getPip();

    ByteString getPipBytes();

    String getProductDesc();

    ByteString getProductDescBytes();

    String getProductId();

    ByteString getProductIdBytes();

    String getProductTag();

    ByteString getProductTagBytes();

    @Deprecated
    TfProductType getProductType();

    @Deprecated
    int getProductTypeValue();

    TfProvider getProvider();

    int getProviderValue();

    String getSpId();

    ByteString getSpIdBytes();

    long getTimestamp();

    TfType getType();

    TfTypeExt getTypeExt();

    int getTypeExtValue();

    int getTypeValue();

    String getUserMob();

    ByteString getUserMobBytes();

    TfWay getWay();

    int getWayValue();
}
