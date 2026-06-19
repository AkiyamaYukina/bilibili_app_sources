package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateRespOrBuilder.class */
public interface TfActivateRespOrBuilder extends MessageLiteOrBuilder {
    String getFakeId();

    ByteString getFakeIdBytes();

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

    String getSpId();

    ByteString getSpIdBytes();

    TfType getType();

    TfTypeExt getTypeExt();

    int getTypeExtValue();

    int getTypeValue();

    String getUserMob();

    ByteString getUserMobBytes();

    TfWay getWay();

    int getWayValue();
}
