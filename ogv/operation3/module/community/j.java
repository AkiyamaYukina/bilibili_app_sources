package com.bilibili.ogv.operation3.module.community;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/j.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class j {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71192d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/j$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71194b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.community.j$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71193a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.community.FollowSeasonResult", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("toast", false);
            pluginGeneratedSerialDescriptor.addElement("refresh", true);
            pluginGeneratedSerialDescriptor.addElement("relation", true);
            pluginGeneratedSerialDescriptor.addElement("fmid", false);
            f71194b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            KSerializer<?> kSerializer2 = BooleanSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer2, kSerializer2, LongSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            int i7;
            long jDecodeLongElement;
            boolean z6;
            boolean zDecodeBooleanElement;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71194b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                i7 = 15;
                z6 = zDecodeBooleanElement2;
            } else {
                strDecodeStringElement = null;
                boolean z7 = true;
                i7 = 0;
                jDecodeLongElement = 0;
                boolean zDecodeBooleanElement3 = false;
                boolean zDecodeBooleanElement4 = false;
                while (z7) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z7 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                        i7 |= 8;
                    }
                }
                z6 = zDecodeBooleanElement3;
                zDecodeBooleanElement = zDecodeBooleanElement4;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new j(i7, jDecodeLongElement, strDecodeStringElement, zDecodeBooleanElement, z6);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71194b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            j jVar = (j) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71194b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, jVar.f71189a);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
            boolean z6 = jVar.f71190b;
            if (zShouldEncodeElementDefault || z6) {
                compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 1, z6);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
            boolean z7 = jVar.f71191c;
            if (zShouldEncodeElementDefault2 || z7) {
                compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 2, z7);
            }
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, jVar.f71192d);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/j$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<j> serializer() {
            return a.f71193a;
        }
    }

    public j(int i7, long j7, String str, boolean z6, boolean z7) {
        if (9 != (i7 & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 9, a.f71194b);
        }
        this.f71189a = str;
        if ((i7 & 2) == 0) {
            this.f71190b = false;
        } else {
            this.f71190b = z6;
        }
        if ((i7 & 4) == 0) {
            this.f71191c = false;
        } else {
            this.f71191c = z7;
        }
        this.f71192d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f71189a, jVar.f71189a) && this.f71190b == jVar.f71190b && this.f71191c == jVar.f71191c && this.f71192d == jVar.f71192d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71192d) + z.a(z.a(this.f71189a.hashCode() * 31, 31, this.f71190b), 31, this.f71191c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowSeasonResult(toast=");
        sb.append(this.f71189a);
        sb.append(", isSuccess=");
        sb.append(this.f71190b);
        sb.append(", didFollowUpper=");
        sb.append(this.f71191c);
        sb.append(", upperMid=");
        return android.support.v4.media.session.a.a(sb, this.f71192d, ")");
    }
}
