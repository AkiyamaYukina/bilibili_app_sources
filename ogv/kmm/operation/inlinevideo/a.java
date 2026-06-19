package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.time.Duration;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/a.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68471c;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.inlinevideo.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0413a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0413a f68472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68473b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinevideo.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68472a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinevideo.ClipInfo", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("start", false);
            pluginGeneratedSerialDescriptor.addElement("end", false);
            f68473b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = LongSerializer.INSTANCE;
            sj0.d dVar = sj0.d.f127269a;
            return new KSerializer[]{kSerializer, dVar, dVar};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            long jDecodeLongElement;
            Duration duration;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68473b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Duration duration2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                sj0.d dVar = sj0.d.f127269a;
                duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, dVar, (Object) null);
                duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, dVar, (Object) null);
                i7 = 7;
            } else {
                boolean z6 = true;
                i7 = 0;
                jDecodeLongElement = 0;
                duration = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, sj0.d.f127269a, duration2);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, sj0.d.f127269a, duration);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, jDecodeLongElement, duration2, duration);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68473b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68473b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, aVar.f68469a);
            sj0.d dVar = sj0.d.f127269a;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, dVar, Duration.box-impl(aVar.f68470b));
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, dVar, Duration.box-impl(aVar.f68471c));
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0413a.f68472a;
        }
    }

    public a(int i7, long j7, Duration duration, Duration duration2) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, C0413a.f68473b);
        }
        this.f68469a = j7;
        this.f68470b = duration.unbox-impl();
        this.f68471c = duration2.unbox-impl();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f68469a == aVar.f68469a && Duration.equals-impl0(this.f68470b, aVar.f68470b) && Duration.equals-impl0(this.f68471c, aVar.f68471c);
    }

    public final int hashCode() {
        return Duration.hashCode-impl(this.f68471c) + RQ.l.a(Long.hashCode(this.f68469a) * 31, 31, this.f68470b);
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f68470b);
        String str2 = Duration.toString-impl(this.f68471c);
        StringBuilder sb = new StringBuilder("ClipInfo(id=");
        G0.d.a(this.f68469a, ", start=", str, sb);
        return D.a(", end=", str2, ")", sb);
    }
}
