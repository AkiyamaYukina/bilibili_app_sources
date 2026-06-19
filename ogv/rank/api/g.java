package com.bilibili.ogv.rank.api;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/g.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71955c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/g$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71957b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.rank.api.g$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71956a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.rank.api.Upper", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("up_name", true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_MID, true);
            pluginGeneratedSerialDescriptor.addElement("image", true);
            f71957b = pluginGeneratedSerialDescriptor;
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71957b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                i7 = 7;
                strDecodeStringElement = strDecodeStringElement3;
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
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
            return new g(i7, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71957b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            g gVar = (g) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71957b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = g.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(gVar.f71953a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, gVar.f71953a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || gVar.f71954b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, gVar.f71954b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(gVar.f71955c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, gVar.f71955c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/g$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<g> serializer() {
            return a.f71956a;
        }
    }

    public g() {
        this.f71953a = "";
        this.f71954b = 0L;
        this.f71955c = "";
    }

    public g(int i7, long j7, String str, String str2) {
        if ((i7 & 1) == 0) {
            this.f71953a = "";
        } else {
            this.f71953a = str;
        }
        this.f71954b = (i7 & 2) == 0 ? 0L : j7;
        if ((i7 & 4) == 0) {
            this.f71955c = "";
        } else {
            this.f71955c = str2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f71953a, gVar.f71953a) && this.f71954b == gVar.f71954b && Intrinsics.areEqual(this.f71955c, gVar.f71955c);
    }

    public final int hashCode() {
        return this.f71955c.hashCode() + C3554n0.a(this.f71953a.hashCode() * 31, 31, this.f71954b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Upper(up_name=");
        sb.append(this.f71953a);
        sb.append(", mid=");
        sb.append(this.f71954b);
        sb.append(", image=");
        return C8770a.a(sb, this.f71955c, ")");
    }
}
