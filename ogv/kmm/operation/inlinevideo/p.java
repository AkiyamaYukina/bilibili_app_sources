package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/p.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class p {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68517c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/p$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68519b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinevideo.p$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68518a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinevideo.VideoDimension", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("width", false);
            pluginGeneratedSerialDescriptor.addElement("height", false);
            pluginGeneratedSerialDescriptor.addElement("rotate", false);
            f68519b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, C8595a.f127260a};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int iDecodeIntElement;
            boolean zBooleanValue;
            int iDecodeIntElement2;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68519b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                i7 = 7;
            } else {
                boolean z6 = true;
                iDecodeIntElement = 0;
                zBooleanValue = false;
                iDecodeIntElement2 = 0;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new p(i7, iDecodeIntElement, iDecodeIntElement2, zBooleanValue);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68519b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            p pVar = (p) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68519b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 0, pVar.f68515a);
            compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 1, pVar.f68516b);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(pVar.f68517c));
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/p$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<p> serializer() {
            return a.f68518a;
        }
    }

    public p(int i7, int i8, int i9, boolean z6) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, a.f68519b);
        }
        this.f68515a = i8;
        this.f68516b = i9;
        this.f68517c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f68515a == pVar.f68515a && this.f68516b == pVar.f68516b && this.f68517c == pVar.f68517c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68517c) + I.a(this.f68516b, Integer.hashCode(this.f68515a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDimension(width=");
        sb.append(this.f68515a);
        sb.append(", height=");
        sb.append(this.f68516b);
        sb.append(", rotate=");
        return androidx.appcompat.app.i.a(sb, this.f68517c, ")");
    }
}
