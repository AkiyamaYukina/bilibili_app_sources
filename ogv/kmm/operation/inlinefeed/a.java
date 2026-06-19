package com.bilibili.ogv.kmm.operation.inlinefeed;

import H3.A;
import H3.B;
import H3.C2047z;
import I.E;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.a;
import com.bilibili.ogv.kmm.operation.api.e;
import com.bilibili.ogv.kmm.operation.inlinevideo.g;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a.class */
@SerialName("INLINE")
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC5118d, InterfaceC7871a, com.bilibili.ogv.kmm.operation.api.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f68341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68342d;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.inlinefeed.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0410a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0410a f68343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68344b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68343a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("INLINE", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            f68344b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer, d.C0412a.f68364a, LongSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            d dVar;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68344b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.C0412a.f68364a, (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                i7 = 15;
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
                        dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.C0412a.f68364a, dVar);
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
            return new a(i7, strDecodeStringElement, strDecodeStringElement2, dVar, jDecodeLongElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68344b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68344b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(aVar.f68339a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, aVar.f68339a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(aVar.f68340b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, aVar.f68340b);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, d.C0412a.f68364a, aVar.f68341c);
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, aVar.f68342d);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0410a.f68343a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c implements com.bilibili.ogv.operation3.module.followable.l, InterfaceC7871a, com.bilibili.ogv.operation3.module.feedback.y, InterfaceC8453a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68345o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f68349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.kmm.operation.api.e f68350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final List<y> f68351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.inlinevideo.g f68352g;

        @Nullable
        public final com.bilibili.ogv.kmm.operation.api.a h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f68353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f68354j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f68355k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f68356l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final String f68357m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68358n;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.inlinefeed.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0411a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0411a f68359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68360b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.a$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68359a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinefeed.CinemaInlineFeedCard.Item", (GeneratedSerializer) obj, 14);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("season_id", true);
                pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
                pluginGeneratedSerialDescriptor.addElement("tags", true);
                pluginGeneratedSerialDescriptor.addElement("inline_video_card", false);
                pluginGeneratedSerialDescriptor.addElement("badge_info", false);
                pluginGeneratedSerialDescriptor.addElement("hide_feedback", true);
                pluginGeneratedSerialDescriptor.addElement("rcmd_oid", true);
                pluginGeneratedSerialDescriptor.addElement("rcmd_otype", true);
                pluginGeneratedSerialDescriptor.addElement("feedback_source", true);
                pluginGeneratedSerialDescriptor.addElement("feedback_content", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68360b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68345o;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                e.a aVar = e.a.f67983a;
                Object value = lazyArr[5].getValue();
                KSerializer nullable = BuiltinSerializersKt.getNullable(g.a.f68506a);
                KSerializer nullable2 = BuiltinSerializersKt.getNullable(a.C0397a.f67978a);
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, aVar, value, nullable, nullable2, booleanSerializer, longSerializer, intSerializer, intSerializer, stringSerializer, lazyArr[13].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                boolean zDecodeBooleanElement;
                int iDecodeIntElement;
                List list;
                com.bilibili.ogv.kmm.operation.api.a aVar;
                int i7;
                Map map;
                String str;
                int i8;
                long jDecodeLongElement;
                com.bilibili.ogv.kmm.operation.inlinevideo.g gVar;
                com.bilibili.ogv.kmm.operation.api.e eVar;
                long jDecodeLongElement2;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                int i9;
                int i10;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68360b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68345o;
                int i11 = 8;
                int i12 = 10;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                    com.bilibili.ogv.kmm.operation.api.e eVar2 = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, e.a.f67983a, (Object) null);
                    List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), (Object) null);
                    gVar = (com.bilibili.ogv.kmm.operation.inlinevideo.g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, g.a.f68506a, (Object) null);
                    com.bilibili.ogv.kmm.operation.api.a aVar2 = (com.bilibili.ogv.kmm.operation.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, a.C0397a.f67978a, (Object) null);
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 8);
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 9);
                    int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 10);
                    int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 11);
                    String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 12);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), (Object) null);
                    i7 = 16383;
                    eVar = eVar2;
                    list = list2;
                    aVar = aVar2;
                    i8 = iDecodeIntElement2;
                    iDecodeIntElement = iDecodeIntElement3;
                    str = strDecodeStringElement4;
                } else {
                    zDecodeBooleanElement = false;
                    int iDecodeIntElement4 = 0;
                    iDecodeIntElement = 0;
                    boolean z6 = true;
                    Map map2 = null;
                    com.bilibili.ogv.kmm.operation.inlinevideo.g gVar2 = null;
                    list = null;
                    aVar = null;
                    String strDecodeStringElement5 = null;
                    String strDecodeStringElement6 = null;
                    long jDecodeLongElement3 = 0;
                    long jDecodeLongElement4 = 0;
                    com.bilibili.ogv.kmm.operation.api.e eVar3 = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    i7 = 0;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                i11 = 8;
                                break;
                            case 0:
                                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i9 = i7;
                                i10 = 1;
                                i7 = i9 | i10;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 1:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i9 = i7;
                                i10 = 2;
                                i7 = i9 | i10;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 2:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i9 = i7;
                                i10 = 4;
                                i7 = i9 | i10;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 3:
                                jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                                i9 = i7;
                                i10 = 8;
                                i7 = i9 | i10;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 4:
                                eVar3 = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, e.a.f67983a, eVar3);
                                i9 = i7;
                                i10 = 16;
                                i7 = i9 | i10;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 5:
                                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list);
                                i7 |= 32;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 6:
                                gVar2 = (com.bilibili.ogv.kmm.operation.inlinevideo.g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, g.a.f68506a, gVar2);
                                i7 |= 64;
                                i11 = 8;
                                i12 = 10;
                                break;
                            case 7:
                                aVar = (com.bilibili.ogv.kmm.operation.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, a.C0397a.f67978a, aVar);
                                i7 |= 128;
                                i11 = 8;
                                break;
                            case 8:
                                zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, i11);
                                i7 |= 256;
                                break;
                            case 9:
                                jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 9);
                                i7 |= 512;
                                break;
                            case 10:
                                iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, i12);
                                i7 |= 1024;
                                break;
                            case 11:
                                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 11);
                                i7 |= 2048;
                                break;
                            case 12:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 12);
                                i7 |= 4096;
                                break;
                            case 13:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), map2);
                                i7 |= 8192;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str2 = strDecodeStringElement5;
                    long j7 = jDecodeLongElement4;
                    map = map2;
                    str = strDecodeStringElement6;
                    i8 = iDecodeIntElement4;
                    jDecodeLongElement = jDecodeLongElement3;
                    gVar = gVar2;
                    eVar = eVar3;
                    jDecodeLongElement2 = j7;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = strDecodeStringElement8;
                    strDecodeStringElement3 = strDecodeStringElement7;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i7, strDecodeStringElement3, strDecodeStringElement2, strDecodeStringElement, jDecodeLongElement2, eVar, list, gVar, aVar, zDecodeBooleanElement, jDecodeLongElement, i8, iDecodeIntElement, str, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68360b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68360b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(cVar.f68346a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f68346a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(cVar.f68347b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, cVar.f68347b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f68348c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cVar.f68348c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || cVar.f68349d != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, cVar.f68349d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(cVar.f68350e, new com.bilibili.ogv.kmm.operation.api.e(0))) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, e.a.f67983a, cVar.f68350e);
                }
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68345o;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(cVar.f68351f, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), cVar.f68351f);
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, g.a.f68506a, cVar.f68352g);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, a.C0397a.f67978a, cVar.h);
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
                boolean z6 = cVar.f68353i;
                if (zShouldEncodeElementDefault2 || z6) {
                    compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 8, z6);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9);
                long j7 = cVar.f68354j;
                if (zShouldEncodeElementDefault3 || j7 != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 9, j7);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10);
                int i7 = cVar.f68355k;
                if (zShouldEncodeElementDefault4 || i7 != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 10, i7);
                }
                boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11);
                int i8 = cVar.f68356l;
                if (zShouldEncodeElementDefault5 || i8 != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 11, i8);
                }
                boolean zShouldEncodeElementDefault6 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12);
                String str = cVar.f68357m;
                if (zShouldEncodeElementDefault6 || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 12, str);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || !Intrinsics.areEqual(cVar.f68358n, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), cVar.f68358n);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return C0411a.f68359a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68345o = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2047z(9)), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new A(6))};
        }

        public c(int i7, String str, String str2, String str3, long j7, com.bilibili.ogv.kmm.operation.api.e eVar, List list, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, com.bilibili.ogv.kmm.operation.api.a aVar, boolean z6, long j8, int i8, int i9, String str4, Map map) {
            if (192 != (i7 & 192)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 192, C0411a.f68360b);
            }
            if ((i7 & 1) == 0) {
                this.f68346a = "";
            } else {
                this.f68346a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68347b = "";
            } else {
                this.f68347b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68348c = "";
            } else {
                this.f68348c = str3;
            }
            if ((i7 & 8) == 0) {
                this.f68349d = 0L;
            } else {
                this.f68349d = j7;
            }
            this.f68350e = (i7 & 16) == 0 ? new com.bilibili.ogv.kmm.operation.api.e(0) : eVar;
            this.f68351f = (i7 & 32) == 0 ? CollectionsKt.emptyList() : list;
            this.f68352g = gVar;
            this.h = aVar;
            if ((i7 & 256) == 0) {
                this.f68353i = false;
            } else {
                this.f68353i = z6;
            }
            this.f68354j = (i7 & 512) == 0 ? 0L : j8;
            if ((i7 & 1024) == 0) {
                this.f68355k = 0;
            } else {
                this.f68355k = i8;
            }
            if ((i7 & 2048) == 0) {
                this.f68356l = 0;
            } else {
                this.f68356l = i9;
            }
            if ((i7 & 4096) == 0) {
                this.f68357m = "";
            } else {
                this.f68357m = str4;
            }
            this.f68358n = (i7 & 8192) == 0 ? MapsKt.emptyMap() : map;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final int a() {
            return this.f68356l;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        @NotNull
        public final String b() {
            return this.f68357m;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.f68349d;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final long d() {
            return this.f68354j;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final int e() {
            return this.f68355k;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f68346a, cVar.f68346a) && Intrinsics.areEqual(this.f68347b, cVar.f68347b) && Intrinsics.areEqual(this.f68348c, cVar.f68348c) && this.f68349d == cVar.f68349d && Intrinsics.areEqual(this.f68350e, cVar.f68350e) && Intrinsics.areEqual(this.f68351f, cVar.f68351f) && Intrinsics.areEqual(this.f68352g, cVar.f68352g) && Intrinsics.areEqual(this.h, cVar.h) && this.f68353i == cVar.f68353i && this.f68354j == cVar.f68354j && this.f68355k == cVar.f68355k && this.f68356l == cVar.f68356l && Intrinsics.areEqual(this.f68357m, cVar.f68357m) && Intrinsics.areEqual(this.f68358n, cVar.f68358n);
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
            return this.f68358n;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final com.bilibili.ogv.operation3.module.followable.m getStatus() {
            return this.f68350e;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68348c;
        }

        public final int hashCode() {
            int iA = e0.a(z.a(C3554n0.a(E.a(E.a(this.f68346a.hashCode() * 31, 31, this.f68347b), 31, this.f68348c), 31, this.f68349d), 31, this.f68350e.f67982a), 31, this.f68351f);
            int iHashCode = 0;
            com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = this.f68352g;
            int iHashCode2 = gVar == null ? 0 : gVar.hashCode();
            com.bilibili.ogv.kmm.operation.api.a aVar = this.h;
            if (aVar != null) {
                iHashCode = aVar.f67977a.hashCode();
            }
            return this.f68358n.hashCode() + E.a(I.a(this.f68356l, I.a(this.f68355k, C3554n0.a(z.a((((iA + iHashCode2) * 31) + iHashCode) * 31, 31, this.f68353i), 31, this.f68354j), 31), 31), 31, this.f68357m);
        }

        @NotNull
        public final String toString() {
            List<y> list = this.f68351f;
            Map<String, String> map = this.f68358n;
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.f68346a);
            sb.append(", cover=");
            sb.append(this.f68347b);
            sb.append(", url=");
            sb.append(this.f68348c);
            sb.append(", season_id=");
            sb.append(this.f68349d);
            sb.append(", status=");
            sb.append(this.f68350e);
            sb.append(", tags=");
            sb.append(list);
            sb.append(", inline_video_card=");
            sb.append(this.f68352g);
            sb.append(", badge_info=");
            sb.append(this.h);
            sb.append(", hide_feedback=");
            sb.append(this.f68353i);
            sb.append(", rcmd_oid=");
            sb.append(this.f68354j);
            sb.append(", rcmd_otype=");
            sb.append(this.f68355k);
            sb.append(", feedback_source=");
            sb.append(this.f68356l);
            sb.append(", feedback_content=");
            return C4665g.a(sb, this.f68357m, ", report=", map, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$d.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class d {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68361c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new B(7)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<c> f68362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68363b;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.inlinefeed.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0412a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0412a f68364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68365b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.inlinefeed.a$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68364a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.inlinefeed.CinemaInlineFeedCard.ModuleData", (GeneratedSerializer) obj, 2);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                f68365b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{d.f68361c[0].getValue(), StringSerializer.INSTANCE};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68365b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.f68361c;
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
                return f68365b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68365b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) d.f68361c[0].getValue(), dVar.f68362a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = dVar.f68363b;
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/a$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return C0412a.f68364a;
            }
        }

        public d(int i7, String str, List list) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, C0412a.f68365b);
            }
            this.f68362a = list;
            if ((i7 & 2) == 0) {
                this.f68363b = "";
            } else {
                this.f68363b = str;
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
            return Intrinsics.areEqual(this.f68362a, dVar.f68362a) && Intrinsics.areEqual(this.f68363b, dVar.f68363b);
        }

        public final int hashCode() {
            return this.f68363b.hashCode() + (this.f68362a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return C8770a.a(M.a("ModuleData(items=", ", url=", this.f68362a), this.f68363b, ")");
        }
    }

    public a(int i7, String str, String str2, d dVar, long j7) {
        if (12 != (i7 & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 12, C0410a.f68344b);
        }
        if ((i7 & 1) == 0) {
            this.f68339a = "";
        } else {
            this.f68339a = str;
        }
        if ((i7 & 2) == 0) {
            this.f68340b = "";
        } else {
            this.f68340b = str2;
        }
        this.f68341c = dVar;
        this.f68342d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f68339a, aVar.f68339a) && Intrinsics.areEqual(this.f68340b, aVar.f68340b) && Intrinsics.areEqual(this.f68341c, aVar.f68341c) && this.f68342d == aVar.f68342d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68342d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68339a;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68341c.f68363b;
    }

    public final int hashCode() {
        int iA = E.a(this.f68339a.hashCode() * 31, 31, this.f68340b);
        return Long.hashCode(this.f68342d) + ((this.f68341c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CinemaInlineFeedCard(type=");
        sb.append(this.f68339a);
        sb.append(", title=");
        sb.append(this.f68340b);
        sb.append(", module_data=");
        sb.append(this.f68341c);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68342d, ")");
    }
}
