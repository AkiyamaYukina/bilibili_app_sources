package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.inlinevideo.a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/q.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class q {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Duration f68520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Duration f68521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InlineScene f68522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InlineType f68523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final com.bilibili.ogv.kmm.operation.inlinevideo.a f68524e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/q$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68526b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinevideo.q$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68525a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinevideo.VideoInfo", (GeneratedSerializer) obj, 5);
            pluginGeneratedSerialDescriptor.addElement("total_duration", false);
            pluginGeneratedSerialDescriptor.addElement("auto_seek", false);
            pluginGeneratedSerialDescriptor.addElement("inline_scene", true);
            pluginGeneratedSerialDescriptor.addElement("inline_type", true);
            pluginGeneratedSerialDescriptor.addElement("clip_info", false);
            f68526b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            sj0.d dVar = sj0.d.f127269a;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(dVar), BuiltinSerializersKt.getNullable(dVar), e.f68493c, f.f68494c, BuiltinSerializersKt.getNullable(a.C0413a.f68472a)};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            InlineScene inlineScene;
            InlineType inlineType;
            com.bilibili.ogv.kmm.operation.inlinevideo.a aVar;
            Duration duration;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68526b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Duration duration2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                sj0.d dVar = sj0.d.f127269a;
                duration2 = (Duration) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, dVar, (Object) null);
                Duration duration3 = (Duration) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, dVar, (Object) null);
                inlineScene = (InlineScene) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, e.f68493c, (Object) null);
                InlineType inlineType2 = (InlineType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, f.f68494c, (Object) null);
                aVar = (com.bilibili.ogv.kmm.operation.inlinevideo.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0413a.f68472a, (Object) null);
                i7 = 31;
                duration = duration3;
                inlineType = inlineType2;
            } else {
                boolean z6 = true;
                i7 = 0;
                Duration duration4 = null;
                inlineScene = null;
                inlineType = null;
                aVar = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        duration2 = (Duration) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, sj0.d.f127269a, duration2);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        duration4 = (Duration) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, sj0.d.f127269a, duration4);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        inlineScene = (InlineScene) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, e.f68493c, inlineScene);
                        i7 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        inlineType = (InlineType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, f.f68494c, inlineType);
                        i7 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        aVar = (com.bilibili.ogv.kmm.operation.inlinevideo.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0413a.f68472a, aVar);
                        i7 |= 16;
                    }
                }
                duration = duration4;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new q(i7, duration2, duration, inlineScene, inlineType, aVar);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68526b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            q qVar = (q) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68526b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = q.Companion;
            sj0.d dVar = sj0.d.f127269a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, dVar, qVar.f68520a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, dVar, qVar.f68521b);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
            InlineScene inlineScene = qVar.f68522c;
            if (zShouldEncodeElementDefault || inlineScene != InlineScene.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, e.f68493c, inlineScene);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
            InlineType inlineType = qVar.f68523d;
            if (zShouldEncodeElementDefault2 || inlineType != InlineType.TYPE_UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, f.f68494c, inlineType);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0413a.f68472a, qVar.f68524e);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/q$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<q> serializer() {
            return a.f68525a;
        }
    }

    public q(int i7, Duration duration, Duration duration2, InlineScene inlineScene, InlineType inlineType, com.bilibili.ogv.kmm.operation.inlinevideo.a aVar) {
        if (19 != (i7 & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 19, a.f68526b);
        }
        this.f68520a = duration;
        this.f68521b = duration2;
        if ((i7 & 4) == 0) {
            this.f68522c = InlineScene.UNKNOWN;
        } else {
            this.f68522c = inlineScene;
        }
        if ((i7 & 8) == 0) {
            this.f68523d = InlineType.TYPE_UNKNOWN;
        } else {
            this.f68523d = inlineType;
        }
        this.f68524e = aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f68520a, qVar.f68520a) && Intrinsics.areEqual(this.f68521b, qVar.f68521b) && this.f68522c == qVar.f68522c && this.f68523d == qVar.f68523d && Intrinsics.areEqual(this.f68524e, qVar.f68524e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Duration duration = this.f68520a;
        int i7 = duration == null ? 0 : Duration.hashCode-impl(duration.unbox-impl());
        Duration duration2 = this.f68521b;
        int i8 = duration2 == null ? 0 : Duration.hashCode-impl(duration2.unbox-impl());
        int iHashCode2 = this.f68522c.hashCode();
        int iHashCode3 = this.f68523d.hashCode();
        com.bilibili.ogv.kmm.operation.inlinevideo.a aVar = this.f68524e;
        if (aVar != null) {
            iHashCode = aVar.hashCode();
        }
        return ((iHashCode3 + ((iHashCode2 + (((i7 * 31) + i8) * 31)) * 31)) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "VideoInfo(totalDuration=" + this.f68520a + ", autoSeek=" + this.f68521b + ", inlineScene=" + this.f68522c + ", inlineType=" + this.f68523d + ", clipInfo=" + this.f68524e + ")";
    }
}
