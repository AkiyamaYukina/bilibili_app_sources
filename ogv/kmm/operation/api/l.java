package com.bilibili.ogv.kmm.operation.api;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/l.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class l {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68014c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/l$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68016b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.api.l$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68015a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.api.Upper", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("up_name", true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_MID, true);
            pluginGeneratedSerialDescriptor.addElement("image", true);
            f68016b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, LongSerializer.INSTANCE, kSerializer};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            int i7;
            long jDecodeLongElement;
            String strDecodeStringElement2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68016b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i7 = 7;
            } else {
                strDecodeStringElement = null;
                boolean z6 = true;
                i7 = 0;
                jDecodeLongElement = 0;
                strDecodeStringElement2 = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new l(i7, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68016b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            l lVar = (l) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68016b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = l.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(lVar.f68012a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, lVar.f68012a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || lVar.f68013b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, lVar.f68013b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(lVar.f68014c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, lVar.f68014c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/l$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<l> serializer() {
            return a.f68015a;
        }
    }

    public l() {
        this.f68012a = "";
        this.f68013b = 0L;
        this.f68014c = "";
    }

    public l(int i7, long j7, String str, String str2) {
        if ((i7 & 1) == 0) {
            this.f68012a = "";
        } else {
            this.f68012a = str;
        }
        this.f68013b = (i7 & 2) == 0 ? 0L : j7;
        if ((i7 & 4) == 0) {
            this.f68014c = "";
        } else {
            this.f68014c = str2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f68012a, lVar.f68012a) && this.f68013b == lVar.f68013b && Intrinsics.areEqual(this.f68014c, lVar.f68014c);
    }

    public final int hashCode() {
        return this.f68014c.hashCode() + C3554n0.a(this.f68012a.hashCode() * 31, 31, this.f68013b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Upper(upName=");
        sb.append(this.f68012a);
        sb.append(", mid=");
        sb.append(this.f68013b);
        sb.append(", image=");
        return C8770a.a(sb, this.f68014c, ")");
    }
}
