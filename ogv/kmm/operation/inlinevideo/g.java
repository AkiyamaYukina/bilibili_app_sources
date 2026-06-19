package com.bilibili.ogv.kmm.operation.inlinevideo;

import A90.u;
import A90.v;
import I.E;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.inlinevideo.d;
import com.bilibili.ogv.operation3.module.operablecard.BizType;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
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
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/g.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class g implements InterfaceC8453a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68495l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f68496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BizType f68497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68502g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f68503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f68504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68505k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/g$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68507b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinevideo.g$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68506a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinevideo.InlineVideoCard", (GeneratedSerializer) obj, 11);
            pluginGeneratedSerialDescriptor.addElement("inline_info", false);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("spmid", true);
            pluginGeneratedSerialDescriptor.addElement("from_spmid", true);
            pluginGeneratedSerialDescriptor.addElement("url", true);
            pluginGeneratedSerialDescriptor.addElement("ep_id", true);
            pluginGeneratedSerialDescriptor.addElement("season_id", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("cover", true);
            pluginGeneratedSerialDescriptor.addElement("hide_fullscreen", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f68507b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = g.f68495l;
            d.a aVar = d.a.f68491a;
            Object value = lazyArr[1].getValue();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            return new KSerializer[]{aVar, value, stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, lazyArr[10].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            boolean zDecodeBooleanElement;
            d dVar;
            String strDecodeStringElement;
            BizType bizType;
            int i7;
            String strDecodeStringElement2;
            String str;
            long jDecodeLongElement;
            Map map;
            long jDecodeLongElement2;
            String str2;
            String strDecodeStringElement3;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68507b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = g.f68495l;
            int i8 = 8;
            int i9 = 4;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68491a, (Object) null);
                bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                i7 = 2047;
                str2 = strDecodeStringElement4;
                str = strDecodeStringElement5;
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), (Object) null);
            } else {
                long jDecodeLongElement3 = 0;
                boolean z6 = true;
                zDecodeBooleanElement = false;
                Map map2 = null;
                dVar = null;
                strDecodeStringElement = null;
                String strDecodeStringElement6 = null;
                String strDecodeStringElement7 = null;
                String strDecodeStringElement8 = null;
                String strDecodeStringElement9 = null;
                long jDecodeLongElement4 = 0;
                bizType = null;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            i8 = 8;
                            break;
                        case 0:
                            dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68491a, dVar);
                            i7 |= 1;
                            i8 = 8;
                            i9 = 4;
                            break;
                        case 1:
                            bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), bizType);
                            i7 |= 2;
                            i8 = 8;
                            i9 = 4;
                            break;
                        case 2:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i7 |= 4;
                            break;
                        case 3:
                            strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                            break;
                        case 4:
                            strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i9);
                            i7 |= 16;
                            break;
                        case 5:
                            jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                            i7 |= 32;
                            break;
                        case 6:
                            jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                            i7 |= 64;
                            break;
                        case 7:
                            strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                            i7 |= 128;
                            break;
                        case 8:
                            strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i8);
                            i7 |= 256;
                            break;
                        case 9:
                            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 9);
                            i7 |= 512;
                            break;
                        case 10:
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), map2);
                            i7 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                long j7 = jDecodeLongElement3;
                String str3 = strDecodeStringElement6;
                strDecodeStringElement2 = strDecodeStringElement8;
                str = strDecodeStringElement9;
                jDecodeLongElement = jDecodeLongElement4;
                map = map2;
                jDecodeLongElement2 = j7;
                str2 = strDecodeStringElement7;
                strDecodeStringElement3 = str3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new g(i7, dVar, bizType, strDecodeStringElement, strDecodeStringElement3, str2, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement2, str, zDecodeBooleanElement, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68507b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            g gVar = (g) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68507b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = g.Companion;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68491a, gVar.f68496a);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
            Lazy<KSerializer<Object>>[] lazyArr = g.f68495l;
            BizType bizType = gVar.f68497b;
            if (zShouldEncodeElementDefault || bizType != BizType.PGC) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), bizType);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
            String str = gVar.f68498c;
            if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, str);
            }
            boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
            String str2 = gVar.f68499d;
            if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str2, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str2);
            }
            boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            String str3 = gVar.f68500e;
            if (zShouldEncodeElementDefault4 || !Intrinsics.areEqual(str3, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, str3);
            }
            boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
            long j7 = gVar.f68501f;
            if (zShouldEncodeElementDefault5 || j7 != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 5, j7);
            }
            boolean zShouldEncodeElementDefault6 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
            long j8 = gVar.f68502g;
            if (zShouldEncodeElementDefault6 || j8 != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 6, j8);
            }
            boolean zShouldEncodeElementDefault7 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7);
            String str4 = gVar.h;
            if (zShouldEncodeElementDefault7 || !Intrinsics.areEqual(str4, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, str4);
            }
            boolean zShouldEncodeElementDefault8 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
            String str5 = gVar.f68503i;
            if (zShouldEncodeElementDefault8 || !Intrinsics.areEqual(str5, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, str5);
            }
            boolean zShouldEncodeElementDefault9 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9);
            boolean z6 = gVar.f68504j;
            if (zShouldEncodeElementDefault9 || z6) {
                compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 9, z6);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || !Intrinsics.areEqual(gVar.f68505k, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), gVar.f68505k);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/g$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<g> serializer() {
            return a.f68506a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f68495l = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new u(7)), null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new v(7))};
    }

    public g(int i7, d dVar, BizType bizType, String str, String str2, String str3, long j7, long j8, String str4, String str5, boolean z6, Map map) {
        if (1 != (i7 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68507b);
        }
        this.f68496a = dVar;
        this.f68497b = (i7 & 2) == 0 ? BizType.PGC : bizType;
        if ((i7 & 4) == 0) {
            this.f68498c = "";
        } else {
            this.f68498c = str;
        }
        if ((i7 & 8) == 0) {
            this.f68499d = "";
        } else {
            this.f68499d = str2;
        }
        if ((i7 & 16) == 0) {
            this.f68500e = "";
        } else {
            this.f68500e = str3;
        }
        if ((i7 & 32) == 0) {
            this.f68501f = 0L;
        } else {
            this.f68501f = j7;
        }
        this.f68502g = (i7 & 64) == 0 ? 0L : j8;
        if ((i7 & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i7 & 256) == 0) {
            this.f68503i = "";
        } else {
            this.f68503i = str5;
        }
        this.f68504j = (i7 & 512) == 0 ? false : z6;
        this.f68505k = (i7 & 1024) == 0 ? MapsKt.emptyMap() : map;
    }

    public g(@NotNull d dVar, @NotNull BizType bizType, @NotNull String str, @NotNull String str2, @NotNull String str3, long j7, long j8, @NotNull String str4, @NotNull String str5, boolean z6, @NotNull Map<String, String> map) {
        this.f68496a = dVar;
        this.f68497b = bizType;
        this.f68498c = str;
        this.f68499d = str2;
        this.f68500e = str3;
        this.f68501f = j7;
        this.f68502g = j8;
        this.h = str4;
        this.f68503i = str5;
        this.f68504j = z6;
        this.f68505k = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f68496a, gVar.f68496a) && this.f68497b == gVar.f68497b && Intrinsics.areEqual(this.f68498c, gVar.f68498c) && Intrinsics.areEqual(this.f68499d, gVar.f68499d) && Intrinsics.areEqual(this.f68500e, gVar.f68500e) && this.f68501f == gVar.f68501f && this.f68502g == gVar.f68502g && Intrinsics.areEqual(this.h, gVar.h) && Intrinsics.areEqual(this.f68503i, gVar.f68503i) && this.f68504j == gVar.f68504j && Intrinsics.areEqual(this.f68505k, gVar.f68505k);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68505k;
    }

    public final int hashCode() {
        return this.f68505k.hashCode() + z.a(E.a(E.a(C3554n0.a(C3554n0.a(E.a(E.a(E.a((this.f68497b.hashCode() + (this.f68496a.hashCode() * 31)) * 31, 31, this.f68498c), 31, this.f68499d), 31, this.f68500e), 31, this.f68501f), 31, this.f68502g), 31, this.h), 31, this.f68503i), 31, this.f68504j);
    }

    @NotNull
    public final String toString() {
        return "InlineVideoCard(inline_info=" + this.f68496a + ", type=" + this.f68497b + ", spmid=" + this.f68498c + ", from_spmid=" + this.f68499d + ", url=" + this.f68500e + ", ep_id=" + this.f68501f + ", season_id=" + this.f68502g + ", title=" + this.h + ", cover=" + this.f68503i + ", hide_fullscreen=" + this.f68504j + ", report=" + this.f68505k + ")";
    }
}
