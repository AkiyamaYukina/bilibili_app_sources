package com.bilibili.ogv.operation3.module.feedback;

import I.E;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/m.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class m {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71227c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/m$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71229b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.feedback.m$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71228a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.feedback.FeedbackBean", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("type", false);
            pluginGeneratedSerialDescriptor.addElement("text", false);
            pluginGeneratedSerialDescriptor.addElement("toast", false);
            f71229b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = IntSerializer.INSTANCE;
            KSerializer<?> kSerializer2 = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer2, kSerializer2};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            int iDecodeIntElement;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71229b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i7 = 7;
            } else {
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                boolean z6 = true;
                iDecodeIntElement = 0;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new m(i7, iDecodeIntElement, strDecodeStringElement2, strDecodeStringElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71229b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            m mVar = (m) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71229b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 0, mVar.f71225a);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, mVar.f71226b);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, mVar.f71227c);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/m$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<m> serializer() {
            return a.f71228a;
        }
    }

    public m(int i7, int i8, String str, String str2) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, a.f71229b);
        }
        this.f71225a = i8;
        this.f71226b = str;
        this.f71227c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f71225a == mVar.f71225a && Intrinsics.areEqual(this.f71226b, mVar.f71226b) && Intrinsics.areEqual(this.f71227c, mVar.f71227c);
    }

    public final int hashCode() {
        return this.f71227c.hashCode() + E.a(Integer.hashCode(this.f71225a) * 31, 31, this.f71226b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackBean(type=");
        sb.append(this.f71225a);
        sb.append(", text=");
        sb.append(this.f71226b);
        sb.append(", toast=");
        return C8770a.a(sb, this.f71227c, ")");
    }
}
