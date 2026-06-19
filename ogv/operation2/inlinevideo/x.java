package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.inlinevideo.InlineScene;
import com.bilibili.ogv.kmm.operation.inlinevideo.InlineType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/x.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class x {

    @NotNull
    public static final b Companion = new b(null);
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f70982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f70983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f70984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InlineScene f70985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InlineType f70986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f70987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f70988g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/x$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f70989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final SerialDescriptor f70990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f70991c;

        static {
            a aVar = new a();
            f70989a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation2.inlinevideo.OGVInlineParams", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("offset_start_time", false);
            pluginGeneratedSerialDescriptor.addElement("offset_end_time", false);
            pluginGeneratedSerialDescriptor.addElement("total_duration", false);
            pluginGeneratedSerialDescriptor.addElement("inline_scene", true);
            pluginGeneratedSerialDescriptor.addElement("inline_video_type", true);
            pluginGeneratedSerialDescriptor.addElement("inline_episode_id", false);
            pluginGeneratedSerialDescriptor.addElement("clip_id", false);
            f70990b = pluginGeneratedSerialDescriptor;
            f70991c = 8;
        }

        private a() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
            int i7;
            InlineType inlineType;
            Duration duration;
            InlineScene inlineScene;
            long jDecodeLongElement;
            long jDecodeLongElement2;
            Duration duration2;
            Duration duration3;
            SerialDescriptor serialDescriptor = f70990b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
            int i8 = 6;
            Duration duration4 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                sj0.d dVar = sj0.d.f127269a;
                duration3 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, dVar, (Object) null);
                duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, dVar, (Object) null);
                duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, dVar, (Object) null);
                inlineScene = (InlineScene) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, com.bilibili.ogv.kmm.operation.inlinevideo.e.f68493c, (Object) null);
                InlineType inlineType2 = (InlineType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, com.bilibili.ogv.kmm.operation.inlinevideo.f.f68494c, (Object) null);
                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                i7 = 127;
                inlineType = inlineType2;
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            } else {
                long jDecodeLongElement3 = 0;
                boolean z6 = true;
                i7 = 0;
                inlineType = null;
                Duration duration5 = null;
                duration = null;
                inlineScene = null;
                long jDecodeLongElement4 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            duration4 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, sj0.d.f127269a, duration4);
                            i7 |= 1;
                            break;
                        case 1:
                            duration5 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, sj0.d.f127269a, duration5);
                            i7 |= 2;
                            i8 = 6;
                            continue;
                        case 2:
                            duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, sj0.d.f127269a, duration);
                            i7 |= 4;
                            continue;
                        case 3:
                            inlineScene = (InlineScene) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, com.bilibili.ogv.kmm.operation.inlinevideo.e.f68493c, inlineScene);
                            i7 |= 8;
                            continue;
                        case 4:
                            inlineType = (InlineType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, com.bilibili.ogv.kmm.operation.inlinevideo.f.f68494c, inlineType);
                            i7 |= 16;
                            continue;
                        case 5:
                            jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                            i7 |= 32;
                            continue;
                        case 6:
                            jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i8);
                            i7 |= 64;
                            continue;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i8 = 6;
                }
                jDecodeLongElement = jDecodeLongElement3;
                jDecodeLongElement2 = jDecodeLongElement4;
                duration2 = duration5;
                duration3 = duration4;
            }
            compositeDecoderBeginStructure.endStructure(serialDescriptor);
            return new x(i7, duration3, duration2, duration, inlineScene, inlineType, jDecodeLongElement2, jDecodeLongElement, null, null);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull x xVar) {
            SerialDescriptor serialDescriptor = f70990b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            x.x(xVar, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            sj0.d dVar = sj0.d.f127269a;
            com.bilibili.ogv.kmm.operation.inlinevideo.e eVar = com.bilibili.ogv.kmm.operation.inlinevideo.e.f68493c;
            com.bilibili.ogv.kmm.operation.inlinevideo.f fVar = com.bilibili.ogv.kmm.operation.inlinevideo.f.f68494c;
            KSerializer<?> kSerializer = LongSerializer.INSTANCE;
            return new KSerializer[]{dVar, dVar, dVar, eVar, fVar, kSerializer, kSerializer};
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f70990b;
        }

        @NotNull
        public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/x$b.class */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<x> serializer() {
            return a.f70989a;
        }
    }

    private /* synthetic */ x(int i7, Duration duration, Duration duration2, Duration duration3, InlineScene inlineScene, InlineType inlineType, long j7, long j8, SerializationConstructorMarker serializationConstructorMarker) {
        if (103 != (i7 & 103)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 103, a.f70989a.getDescriptor());
        }
        this.f70982a = duration.unbox-impl();
        this.f70983b = duration2.unbox-impl();
        this.f70984c = duration3.unbox-impl();
        if ((i7 & 8) == 0) {
            this.f70985d = InlineScene.UNKNOWN;
        } else {
            this.f70985d = inlineScene;
        }
        if ((i7 & 16) == 0) {
            this.f70986e = InlineType.TYPE_UNKNOWN;
        } else {
            this.f70986e = inlineType;
        }
        this.f70987f = j7;
        this.f70988g = j8;
    }

    public /* synthetic */ x(int i7, Duration duration, Duration duration2, Duration duration3, InlineScene inlineScene, InlineType inlineType, long j7, long j8, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, duration, duration2, duration3, inlineScene, inlineType, j7, j8, serializationConstructorMarker);
    }

    private x(long j7, long j8, long j9, InlineScene inlineScene, InlineType inlineType, long j10, long j11) {
        this.f70982a = j7;
        this.f70983b = j8;
        this.f70984c = j9;
        this.f70985d = inlineScene;
        this.f70986e = inlineType;
        this.f70987f = j10;
        this.f70988g = j11;
    }

    public /* synthetic */ x(long j7, long j8, long j9, InlineScene inlineScene, InlineType inlineType, long j10, long j11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j8, j9, (i7 & 8) != 0 ? InlineScene.UNKNOWN : inlineScene, (i7 & 16) != 0 ? InlineType.TYPE_UNKNOWN : inlineType, j10, j11, null);
    }

    public /* synthetic */ x(long j7, long j8, long j9, InlineScene inlineScene, InlineType inlineType, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j8, j9, inlineScene, inlineType, j10, j11);
    }

    public static /* synthetic */ x i(x xVar, long j7, long j8, long j9, InlineScene inlineScene, InlineType inlineType, long j10, long j11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = xVar.f70982a;
        }
        if ((i7 & 2) != 0) {
            j8 = xVar.f70983b;
        }
        if ((i7 & 4) != 0) {
            j9 = xVar.f70984c;
        }
        if ((i7 & 8) != 0) {
            inlineScene = xVar.f70985d;
        }
        if ((i7 & 16) != 0) {
            inlineType = xVar.f70986e;
        }
        if ((i7 & 32) != 0) {
            j10 = xVar.f70987f;
        }
        if ((i7 & 64) != 0) {
            j11 = xVar.f70988g;
        }
        return xVar.h(j7, j8, j9, inlineScene, inlineType, j10, j11);
    }

    @SerialName("clip_id")
    public static /* synthetic */ void k() {
    }

    @SerialName("inline_episode_id")
    public static /* synthetic */ void m() {
    }

    @SerialName("inline_scene")
    public static /* synthetic */ void o() {
    }

    @SerialName("inline_video_type")
    public static /* synthetic */ void q() {
    }

    @SerialName("offset_end_time")
    public static /* synthetic */ void s() {
    }

    @SerialName("offset_start_time")
    public static /* synthetic */ void u() {
    }

    @SerialName("total_duration")
    public static /* synthetic */ void w() {
    }

    @JvmStatic
    public static final /* synthetic */ void x(x xVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        sj0.d dVar = sj0.d.f127269a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, dVar, Duration.box-impl(xVar.f70982a));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, dVar, Duration.box-impl(xVar.f70983b));
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, dVar, Duration.box-impl(xVar.f70984c));
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || xVar.f70985d != InlineScene.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, com.bilibili.ogv.kmm.operation.inlinevideo.e.f68493c, xVar.f70985d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || xVar.f70986e != InlineType.TYPE_UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, com.bilibili.ogv.kmm.operation.inlinevideo.f.f68494c, xVar.f70986e);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, xVar.f70987f);
        compositeEncoder.encodeLongElement(serialDescriptor, 6, xVar.f70988g);
    }

    public final long a() {
        return this.f70982a;
    }

    public final long b() {
        return this.f70983b;
    }

    public final long c() {
        return this.f70984c;
    }

    @NotNull
    public final InlineScene d() {
        return this.f70985d;
    }

    @NotNull
    public final InlineType e() {
        return this.f70986e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Duration.equals-impl0(this.f70982a, xVar.f70982a) && Duration.equals-impl0(this.f70983b, xVar.f70983b) && Duration.equals-impl0(this.f70984c, xVar.f70984c) && this.f70985d == xVar.f70985d && this.f70986e == xVar.f70986e && this.f70987f == xVar.f70987f && this.f70988g == xVar.f70988g;
    }

    public final long f() {
        return this.f70987f;
    }

    public final long g() {
        return this.f70988g;
    }

    @NotNull
    public final x h(long j7, long j8, long j9, @NotNull InlineScene inlineScene, @NotNull InlineType inlineType, long j10, long j11) {
        return new x(j7, j8, j9, inlineScene, inlineType, j10, j11, null);
    }

    public int hashCode() {
        int iA = RQ.l.a(RQ.l.a(Duration.hashCode-impl(this.f70982a) * 31, 31, this.f70983b), 31, this.f70984c);
        return Long.hashCode(this.f70988g) + C3554n0.a((this.f70986e.hashCode() + ((this.f70985d.hashCode() + iA) * 31)) * 31, 31, this.f70987f);
    }

    public final long j() {
        return this.f70988g;
    }

    public final long l() {
        return this.f70987f;
    }

    @NotNull
    public final InlineScene n() {
        return this.f70985d;
    }

    @NotNull
    public final InlineType p() {
        return this.f70986e;
    }

    public final long r() {
        return this.f70983b;
    }

    public final long t() {
        return this.f70982a;
    }

    @NotNull
    public String toString() {
        String str = Duration.toString-impl(this.f70982a);
        String str2 = Duration.toString-impl(this.f70983b);
        String str3 = Duration.toString-impl(this.f70984c);
        InlineScene inlineScene = this.f70985d;
        InlineType inlineType = this.f70986e;
        long j7 = this.f70987f;
        long j8 = this.f70988g;
        StringBuilder sbA = G0.b.a("OGVInlineParams(offsetStartTime=", str, ", offsetEndTime=", str2, ", totalDuration=");
        sbA.append(str3);
        sbA.append(", inlineScene=");
        sbA.append(inlineScene);
        sbA.append(", inlineVideoType=");
        sbA.append(inlineType);
        sbA.append(", inlineEpisodeId=");
        sbA.append(j7);
        return androidx.exifinterface.media.a.a(j8, ", clipId=", ")", sbA);
    }

    public final long v() {
        return this.f70984c;
    }
}
