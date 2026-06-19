package com.bilibili.ogv.kmm.operation.inlinefeed;

import H3.O;
import H3.P;
import I.E;
import K7.M;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.e;
import com.bilibili.ogv.kmm.operation.inlinevideo.g;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w.class */
@SerialName("FALL_FEED")
@StabilityInferred(parameters = 0)
@Serializable
public final class w implements InterfaceC5118d, InterfaceC7871a, com.bilibili.ogv.kmm.operation.api.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f68443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68444d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68446b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.w$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68445a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FALL_FEED", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            f68446b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, d.a.f68461a, LongSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            d dVar;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68446b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.a.f68461a, (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                i7 = 15;
                strDecodeStringElement = strDecodeStringElement3;
                strDecodeStringElement2 = strDecodeStringElement4;
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                dVar = null;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.a.f68461a, dVar);
                        i7 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                        i7 |= 8;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new w(i7, strDecodeStringElement, strDecodeStringElement2, dVar, jDecodeLongElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68446b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            w wVar = (w) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68446b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = w.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(wVar.f68441a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, wVar.f68441a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(wVar.f68442b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, wVar.f68442b);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.a.f68461a, wVar.f68443c);
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, wVar.f68444d);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<w> serializer() {
            return a.f68445a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c implements com.bilibili.ogv.operation3.module.followable.l, InterfaceC8453a, InterfaceC7871a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68447j = {null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new O(7))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.inlinevideo.g f68452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f68454g;

        @NotNull
        public final com.bilibili.ogv.kmm.operation.api.e h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68455i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68457b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.w$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68456a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinefeed.InlineSingleCard.Item", (GeneratedSerializer) obj, 9);
                pluginGeneratedSerialDescriptor.addElement("title", false);
                pluginGeneratedSerialDescriptor.addElement("sub_title", false);
                pluginGeneratedSerialDescriptor.addElement("cover", false);
                pluginGeneratedSerialDescriptor.addElement("v_cover", false);
                pluginGeneratedSerialDescriptor.addElement("inline_video_card", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("season_id", true);
                pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
                pluginGeneratedSerialDescriptor.addElement("report", false);
                f68457b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68447j;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(g.a.f68506a), stringSerializer, LongSerializer.INSTANCE, e.a.f67983a, lazyArr[8].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                com.bilibili.ogv.kmm.operation.inlinevideo.g gVar;
                long jDecodeLongElement;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                Map map;
                com.bilibili.ogv.kmm.operation.api.e eVar;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68457b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68447j;
                String strDecodeStringElement5 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    com.bilibili.ogv.kmm.operation.inlinevideo.g gVar2 = (com.bilibili.ogv.kmm.operation.inlinevideo.g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, g.a.f68506a, (Object) null);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                    eVar = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, e.a.f67983a, (Object) null);
                    i7 = 511;
                    gVar = gVar2;
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), (Object) null);
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    Map map2 = null;
                    com.bilibili.ogv.kmm.operation.api.e eVar2 = null;
                    gVar = null;
                    String strDecodeStringElement6 = null;
                    String strDecodeStringElement7 = null;
                    jDecodeLongElement = 0;
                    strDecodeStringElement = null;
                    String strDecodeStringElement8 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                gVar = (com.bilibili.ogv.kmm.operation.inlinevideo.g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, g.a.f68506a, gVar);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i7 |= 32;
                                break;
                            case 6:
                                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                                i7 |= 64;
                                break;
                            case 7:
                                eVar2 = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, e.a.f67983a, eVar2);
                                i7 |= 128;
                                break;
                            case 8:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), map2);
                                i7 |= 256;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str = strDecodeStringElement8;
                    strDecodeStringElement2 = strDecodeStringElement6;
                    String str2 = strDecodeStringElement7;
                    map = map2;
                    eVar = eVar2;
                    strDecodeStringElement3 = str2;
                    strDecodeStringElement4 = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i7, strDecodeStringElement5, strDecodeStringElement, strDecodeStringElement4, strDecodeStringElement2, gVar, strDecodeStringElement3, jDecodeLongElement, eVar, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68457b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68457b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f68448a);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, cVar.f68449b);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cVar.f68450c);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, cVar.f68451d);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = cVar.f68452e;
                if (zShouldEncodeElementDefault || gVar != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, g.a.f68506a, gVar);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                String str = cVar.f68453f;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, str);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
                long j7 = cVar.f68454g;
                if (zShouldEncodeElementDefault3 || j7 != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 6, j7);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7);
                com.bilibili.ogv.kmm.operation.api.e eVar = cVar.h;
                if (zShouldEncodeElementDefault4 || !Intrinsics.areEqual(eVar, new com.bilibili.ogv.kmm.operation.api.e(0))) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, e.a.f67983a, eVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (SerializationStrategy) c.f68447j[8].getValue(), cVar.f68455i);
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return a.f68456a;
            }
        }

        public c(int i7, String str, String str2, String str3, String str4, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, String str5, long j7, com.bilibili.ogv.kmm.operation.api.e eVar, Map map) {
            if (271 != (i7 & 271)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 271, a.f68457b);
            }
            this.f68448a = str;
            this.f68449b = str2;
            this.f68450c = str3;
            this.f68451d = str4;
            if ((i7 & 16) == 0) {
                this.f68452e = null;
            } else {
                this.f68452e = gVar;
            }
            if ((i7 & 32) == 0) {
                this.f68453f = "";
            } else {
                this.f68453f = str5;
            }
            if ((i7 & 64) == 0) {
                this.f68454g = 0L;
            } else {
                this.f68454g = j7;
            }
            if ((i7 & 128) == 0) {
                this.h = new com.bilibili.ogv.kmm.operation.api.e(0);
            } else {
                this.h = eVar;
            }
            this.f68455i = map;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.f68454g;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f68448a, cVar.f68448a) && Intrinsics.areEqual(this.f68449b, cVar.f68449b) && Intrinsics.areEqual(this.f68450c, cVar.f68450c) && Intrinsics.areEqual(this.f68451d, cVar.f68451d) && Intrinsics.areEqual(this.f68452e, cVar.f68452e) && Intrinsics.areEqual(this.f68453f, cVar.f68453f) && this.f68454g == cVar.f68454g && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f68455i, cVar.f68455i);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String f() {
            return "pgc.{pageName}.recommend.works.show";
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String getClickEventId() {
            return "pgc.{pageName}.recommend.works.click";
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68455i;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final com.bilibili.ogv.operation3.module.followable.m getStatus() {
            return this.h;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68453f;
        }

        public final int hashCode() {
            int iA = E.a(E.a(E.a(this.f68448a.hashCode() * 31, 31, this.f68449b), 31, this.f68450c), 31, this.f68451d);
            com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = this.f68452e;
            return this.f68455i.hashCode() + z.a(C3554n0.a(E.a((iA + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f68453f), 31, this.f68454g), 31, this.h.f67982a);
        }

        @NotNull
        public final String toString() {
            return "Item(title=" + this.f68448a + ", subtitle=" + this.f68449b + ", cover=" + this.f68450c + ", v_cover=" + this.f68451d + ", inline_video_card=" + this.f68452e + ", url=" + this.f68453f + ", season_id=" + this.f68454g + ", status=" + this.h + ", report=" + this.f68455i + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$d.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class d {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68458c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new P(6)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<c> f68459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68460b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68462b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.w$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68461a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinefeed.InlineSingleCard.ModuleData", (GeneratedSerializer) obj, 2);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                f68462b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{d.f68458c[0].getValue(), StringSerializer.INSTANCE};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68462b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.f68458c;
                List list = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i7 = 3;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    strDecodeStringElement = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                            i7 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i7, strDecodeStringElement, list);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68462b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68462b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) d.f68458c[0].getValue(), dVar.f68459a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = dVar.f68460b;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/w$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return a.f68461a;
            }
        }

        public d(int i7, String str, List list) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68462b);
            }
            this.f68459a = list;
            if ((i7 & 2) == 0) {
                this.f68460b = "";
            } else {
                this.f68460b = str;
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
            return Intrinsics.areEqual(this.f68459a, dVar.f68459a) && Intrinsics.areEqual(this.f68460b, dVar.f68460b);
        }

        public final int hashCode() {
            return this.f68460b.hashCode() + (this.f68459a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return C8770a.a(M.a("ModuleData(items=", ", url=", this.f68459a), this.f68460b, ")");
        }
    }

    public w(int i7, String str, String str2, d dVar, long j7) {
        if (12 != (i7 & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 12, a.f68446b);
        }
        if ((i7 & 1) == 0) {
            this.f68441a = "";
        } else {
            this.f68441a = str;
        }
        if ((i7 & 2) == 0) {
            this.f68442b = "";
        } else {
            this.f68442b = str2;
        }
        this.f68443c = dVar;
        this.f68444d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f68441a, wVar.f68441a) && Intrinsics.areEqual(this.f68442b, wVar.f68442b) && Intrinsics.areEqual(this.f68443c, wVar.f68443c) && this.f68444d == wVar.f68444d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68444d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68441a;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68443c.f68460b;
    }

    public final int hashCode() {
        int iA = E.a(this.f68441a.hashCode() * 31, 31, this.f68442b);
        return Long.hashCode(this.f68444d) + ((this.f68443c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineSingleCard(type=");
        sb.append(this.f68441a);
        sb.append(", title=");
        sb.append(this.f68442b);
        sb.append(", module_data=");
        sb.append(this.f68443c);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68444d, ")");
    }
}
