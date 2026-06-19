package com.bilibili.ogv.filmlist.api;

import I.E;
import androidx.appcompat.app.i;
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
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/d.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f67678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67679d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/d$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f67680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f67681b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.filmlist.api.d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f67680a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.filmlist.api.Upper", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("uname", true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_MID, true);
            pluginGeneratedSerialDescriptor.addElement("avatar", true);
            pluginGeneratedSerialDescriptor.addElement("is_follow", true);
            f67681b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, LongSerializer.INSTANCE, kSerializer, C8595a.f127260a};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            int i7;
            long jDecodeLongElement;
            String strDecodeStringElement2;
            boolean zBooleanValue;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67681b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                i7 = 15;
            } else {
                strDecodeStringElement = null;
                boolean z6 = true;
                i7 = 0;
                jDecodeLongElement = 0;
                strDecodeStringElement2 = null;
                zBooleanValue = false;
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
                    } else if (iDecodeElementIndex == 2) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                        i7 |= 8;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new d(jDecodeLongElement, zBooleanValue, i7, strDecodeStringElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f67681b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            d dVar = (d) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67681b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = d.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(dVar.f67676a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, dVar.f67676a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || dVar.f67677b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, dVar.f67677b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(dVar.f67678c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, dVar.f67678c);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || dVar.f67679d) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, C8595a.f127260a, Boolean.valueOf(dVar.f67679d));
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/d$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<d> serializer() {
            return a.f67680a;
        }
    }

    public d() {
        this.f67676a = "";
        this.f67677b = 0L;
        this.f67678c = "";
        this.f67679d = false;
    }

    public d(long j7, boolean z6, int i7, String str, String str2) {
        if ((i7 & 1) == 0) {
            this.f67676a = "";
        } else {
            this.f67676a = str;
        }
        this.f67677b = (i7 & 2) == 0 ? 0L : j7;
        if ((i7 & 4) == 0) {
            this.f67678c = "";
        } else {
            this.f67678c = str2;
        }
        if ((i7 & 8) == 0) {
            this.f67679d = false;
        } else {
            this.f67679d = z6;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f67676a, dVar.f67676a) && this.f67677b == dVar.f67677b && Intrinsics.areEqual(this.f67678c, dVar.f67678c) && this.f67679d == dVar.f67679d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67679d) + E.a(C3554n0.a(this.f67676a.hashCode() * 31, 31, this.f67677b), 31, this.f67678c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Upper(uname=");
        sb.append(this.f67676a);
        sb.append(", mid=");
        sb.append(this.f67677b);
        sb.append(", avatar=");
        sb.append(this.f67678c);
        sb.append(", isFollowed=");
        return i.a(sb, this.f67679d, ")");
    }
}
