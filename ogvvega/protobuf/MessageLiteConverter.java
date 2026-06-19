package com.bilibili.ogvvega.protobuf;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/MessageLiteConverter.class */
public final class MessageLiteConverter {

    @NotNull
    public static final MessageLiteConverter INSTANCE = new MessageLiteConverter();

    private MessageLiteConverter() {
    }

    public final /* synthetic */ <T> T messageLite2vo(MessageLite messageLite) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) messageLite2vo(messageLite, Object.class);
    }

    public final <T> T messageLite2vo(@NotNull MessageLite messageLite, @NotNull Class<T> cls) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        messageLite.writeTo(byteArrayOutputStream);
        return (T) ProtoBufEncoder.INSTANCE.decode(byteArrayOutputStream.toByteArray(), cls);
    }
}
