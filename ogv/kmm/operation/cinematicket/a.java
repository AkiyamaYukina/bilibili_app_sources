package com.bilibili.ogv.kmm.operation.cinematicket;

import H3.C2038p;
import H3.C2039q;
import H3.C2040s;
import H3.C2041t;
import H3.r;
import I.E;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.a;
import com.bilibili.ogv.kmm.operation.api.e;
import com.bilibili.ogv.kmm.operation.inlinevideo.d;
import com.bilibili.ogv.operation3.module.feedback.y;
import com.bilibili.ogv.operation3.module.followable.l;
import com.bilibili.ogv.operation3.module.followable.m;
import com.bilibili.ogv.operation3.module.operablecard.BizType;
import gk0.C7347a;
import h6.C7416u;
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
import kotlin.time.Duration;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a.class */
@SerialName("LIMIT_FREE")
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC5118d, InterfaceC7871a, com.bilibili.ogv.kmm.operation.api.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f68181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68182c;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.cinematicket.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0403a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0403a f68183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68184b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.cinematicket.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68183a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("LIMIT_FREE", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("type", false);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            f68184b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, d.C0405a.f68216a, LongSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            int i7;
            d dVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68184b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            String strDecodeStringElement = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d.C0405a.f68216a, (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                i7 = 7;
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                i7 = 0;
                dVar = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d.C0405a.f68216a, dVar);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, strDecodeStringElement, dVar, jDecodeLongElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68184b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68184b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, aVar.f68180a);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d.C0405a.f68216a, aVar.f68181b);
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 2, aVar.f68182c);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0403a.f68183a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c implements InterfaceC7871a, l, y, InterfaceC8453a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68185w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f68191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.kmm.operation.api.e f68192g;

        @NotNull
        public final List<com.bilibili.ogv.kmm.operation.inlinefeed.y> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.inlinevideo.d f68193i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final BizType f68194j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f68195k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final String f68196l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f68197m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f68198n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.api.a f68199o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final C7347a f68200p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final long f68201q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f68202r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f68203s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final String f68204t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68205u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.inlinevideo.g f68206v;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.cinematicket.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0404a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0404a f68207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68208b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.cinematicket.a$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68207a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.cinematicket.CinemaTicketInline.Item", (GeneratedSerializer) obj, 21);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("v_cover", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("season_id", true);
                pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
                pluginGeneratedSerialDescriptor.addElement("tags", true);
                pluginGeneratedSerialDescriptor.addElement("inline_info", true);
                pluginGeneratedSerialDescriptor.addElement("type", true);
                pluginGeneratedSerialDescriptor.addElement("spmid", true);
                pluginGeneratedSerialDescriptor.addElement("from_spmid", true);
                pluginGeneratedSerialDescriptor.addElement("ep_id", true);
                pluginGeneratedSerialDescriptor.addElement("hide_fullscreen", true);
                pluginGeneratedSerialDescriptor.addElement("badge_info", false);
                pluginGeneratedSerialDescriptor.addElement("button", true);
                pluginGeneratedSerialDescriptor.addElement("rcmd_oid", true);
                pluginGeneratedSerialDescriptor.addElement("rcmd_otype", true);
                pluginGeneratedSerialDescriptor.addElement("feedback_source", true);
                pluginGeneratedSerialDescriptor.addElement("feedback_content", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68208b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68185w;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                e.a aVar = e.a.f67983a;
                Object value = lazyArr[7].getValue();
                KSerializer nullable = BuiltinSerializersKt.getNullable(d.a.f68491a);
                Object value2 = lazyArr[9].getValue();
                BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
                KSerializer nullable2 = BuiltinSerializersKt.getNullable(a.C0397a.f67978a);
                C7347a.C1272a c1272a = C7347a.C1272a.f120373a;
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, aVar, value, nullable, value2, stringSerializer, stringSerializer, longSerializer, booleanSerializer, nullable2, c1272a, longSerializer, intSerializer, intSerializer, stringSerializer, lazyArr[20].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                com.bilibili.ogv.kmm.operation.api.a aVar;
                com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
                List list;
                Map map;
                BizType bizType;
                com.bilibili.ogv.kmm.operation.api.e eVar;
                String str;
                String str2;
                String str3;
                long jDecodeLongElement;
                int i7;
                int i8;
                long jDecodeLongElement2;
                C7347a c7347a;
                boolean zDecodeBooleanElement;
                long jDecodeLongElement3;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                String strDecodeStringElement5;
                int i9;
                int i10;
                int i11;
                int i12;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68208b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68185w;
                int i13 = 10;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                    eVar = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, e.a.f67983a, (Object) null);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), (Object) null);
                    com.bilibili.ogv.kmm.operation.inlinevideo.d dVar2 = (com.bilibili.ogv.kmm.operation.inlinevideo.d) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, d.a.f68491a, (Object) null);
                    bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), (Object) null);
                    String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 10);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 12);
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 13);
                    aVar = (com.bilibili.ogv.kmm.operation.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, a.C0397a.f67978a, (Object) null);
                    C7347a c7347a2 = (C7347a) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 15, C7347a.C1272a.f120373a, (Object) null);
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 16);
                    int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 17);
                    int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 18);
                    String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 19);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), (Object) null);
                    i9 = 2097151;
                    str = strDecodeStringElement6;
                    dVar = dVar2;
                    str2 = strDecodeStringElement7;
                    c7347a = c7347a2;
                    i8 = iDecodeIntElement;
                    i7 = iDecodeIntElement2;
                    str3 = strDecodeStringElement8;
                } else {
                    int i14 = 0;
                    int iDecodeIntElement3 = 0;
                    boolean zDecodeBooleanElement2 = false;
                    boolean z6 = true;
                    C7347a c7347a3 = null;
                    aVar = null;
                    dVar = null;
                    list = null;
                    map = null;
                    bizType = null;
                    String strDecodeStringElement9 = null;
                    String strDecodeStringElement10 = null;
                    String strDecodeStringElement11 = null;
                    String strDecodeStringElement12 = null;
                    String strDecodeStringElement13 = null;
                    String strDecodeStringElement14 = null;
                    long jDecodeLongElement4 = 0;
                    long jDecodeLongElement5 = 0;
                    long jDecodeLongElement6 = 0;
                    eVar = null;
                    String strDecodeStringElement15 = null;
                    String strDecodeStringElement16 = null;
                    int iDecodeIntElement4 = 0;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i11 = i14;
                                i12 = 1;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 1:
                                strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i11 = i14;
                                i12 = 2;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 2:
                                strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i11 = i14;
                                i12 = 4;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 3:
                                strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i11 = i14;
                                i12 = 8;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 4:
                                strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i11 = i14;
                                i12 = 16;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 5:
                                jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                                i11 = i14;
                                i12 = 32;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 6:
                                eVar = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, e.a.f67983a, eVar);
                                i11 = i14;
                                i12 = 64;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 7:
                                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), list);
                                i14 |= 128;
                                i13 = 10;
                                break;
                            case 8:
                                dVar = (com.bilibili.ogv.kmm.operation.inlinevideo.d) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, d.a.f68491a, dVar);
                                i11 = i14;
                                i12 = 256;
                                i14 = i11 | i12;
                                i13 = 10;
                                break;
                            case 9:
                                bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), bizType);
                                i14 |= 512;
                                break;
                            case 10:
                                strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i13);
                                i14 |= 1024;
                                break;
                            case 11:
                                strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                                i14 |= 2048;
                                break;
                            case 12:
                                jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 12);
                                i14 |= 4096;
                                break;
                            case 13:
                                zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 13);
                                i14 |= 8192;
                                break;
                            case 14:
                                aVar = (com.bilibili.ogv.kmm.operation.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, a.C0397a.f67978a, aVar);
                                i14 |= 16384;
                                break;
                            case 15:
                                c7347a3 = (C7347a) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 15, C7347a.C1272a.f120373a, c7347a3);
                                i10 = 32768;
                                i14 |= i10;
                                break;
                            case 16:
                                jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 16);
                                i14 |= 65536;
                                break;
                            case 17:
                                iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 17);
                                i14 |= 131072;
                                break;
                            case 18:
                                iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 18);
                                i14 |= 262144;
                                break;
                            case 19:
                                strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 19);
                                i14 |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                                break;
                            case 20:
                                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), map);
                                i10 = AccessibilityNodeInfoCompat.ACTION_DISMISS;
                                i14 |= i10;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    str = strDecodeStringElement11;
                    str2 = strDecodeStringElement12;
                    str3 = strDecodeStringElement14;
                    boolean z7 = zDecodeBooleanElement2;
                    long j7 = jDecodeLongElement5;
                    jDecodeLongElement = jDecodeLongElement6;
                    i7 = iDecodeIntElement3;
                    i8 = iDecodeIntElement4;
                    jDecodeLongElement2 = jDecodeLongElement4;
                    c7347a = c7347a3;
                    zDecodeBooleanElement = z7;
                    jDecodeLongElement3 = j7;
                    strDecodeStringElement = strDecodeStringElement13;
                    strDecodeStringElement2 = strDecodeStringElement10;
                    strDecodeStringElement3 = strDecodeStringElement9;
                    strDecodeStringElement4 = strDecodeStringElement16;
                    strDecodeStringElement5 = strDecodeStringElement15;
                    i9 = i14;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i9, strDecodeStringElement5, strDecodeStringElement4, strDecodeStringElement3, strDecodeStringElement2, str, jDecodeLongElement, eVar, list, dVar, bizType, str2, strDecodeStringElement, jDecodeLongElement3, zDecodeBooleanElement, aVar, c7347a, jDecodeLongElement2, i8, i7, str3, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68208b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68208b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(cVar.f68186a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f68186a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(cVar.f68187b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, cVar.f68187b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f68188c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cVar.f68188c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(cVar.f68189d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, cVar.f68189d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(cVar.f68190e, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, cVar.f68190e);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || cVar.f68191f != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 5, cVar.f68191f);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(cVar.f68192g, new com.bilibili.ogv.kmm.operation.api.e(0))) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, e.a.f67983a, cVar.f68192g);
                }
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68185w;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(cVar.h, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), cVar.h);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || cVar.f68193i != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, d.a.f68491a, cVar.f68193i);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || cVar.f68194j != BizType.PGC) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), cVar.f68194j);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || !Intrinsics.areEqual(cVar.f68195k, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 10, cVar.f68195k);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11) || !Intrinsics.areEqual(cVar.f68196l, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 11, cVar.f68196l);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12) || cVar.f68197m != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 12, cVar.f68197m);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || cVar.f68198n) {
                    compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 13, cVar.f68198n);
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, a.C0397a.f67978a, cVar.f68199o);
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 15);
                C7347a c7347a = cVar.f68200p;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(c7347a, new C7347a("", 2))) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 15, C7347a.C1272a.f120373a, c7347a);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 16);
                long j7 = cVar.f68201q;
                if (zShouldEncodeElementDefault3 || j7 != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 16, j7);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 17);
                int i7 = cVar.f68202r;
                if (zShouldEncodeElementDefault4 || i7 != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 17, i7);
                }
                boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 18);
                int i8 = cVar.f68203s;
                if (zShouldEncodeElementDefault5 || i8 != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 18, i8);
                }
                boolean zShouldEncodeElementDefault6 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 19);
                String str = cVar.f68204t;
                if (zShouldEncodeElementDefault6 || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 19, str);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 20) || !Intrinsics.areEqual(cVar.f68205u, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), cVar.f68205u);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return C0404a.f68207a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68185w = new Lazy[]{null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2038p(5)), null, LazyKt.lazy(lazyThreadSafetyMode, new C2039q(8)), null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new r(6))};
        }

        public c(int i7, String str, String str2, String str3, String str4, String str5, long j7, com.bilibili.ogv.kmm.operation.api.e eVar, List list, com.bilibili.ogv.kmm.operation.inlinevideo.d dVar, BizType bizType, String str6, String str7, long j8, boolean z6, com.bilibili.ogv.kmm.operation.api.a aVar, C7347a c7347a, long j9, int i8, int i9, String str8, Map map) {
            if (16384 != (i7 & 16384)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 16384, C0404a.f68208b);
            }
            if ((i7 & 1) == 0) {
                this.f68186a = "";
            } else {
                this.f68186a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68187b = "";
            } else {
                this.f68187b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68188c = "";
            } else {
                this.f68188c = str3;
            }
            if ((i7 & 8) == 0) {
                this.f68189d = "";
            } else {
                this.f68189d = str4;
            }
            if ((i7 & 16) == 0) {
                this.f68190e = "";
            } else {
                this.f68190e = str5;
            }
            if ((i7 & 32) == 0) {
                this.f68191f = 0L;
            } else {
                this.f68191f = j7;
            }
            this.f68192g = (i7 & 64) == 0 ? new com.bilibili.ogv.kmm.operation.api.e(0) : eVar;
            this.h = (i7 & 128) == 0 ? CollectionsKt.emptyList() : list;
            if ((i7 & 256) == 0) {
                this.f68193i = null;
            } else {
                this.f68193i = dVar;
            }
            this.f68194j = (i7 & 512) == 0 ? BizType.PGC : bizType;
            if ((i7 & 1024) == 0) {
                this.f68195k = "";
            } else {
                this.f68195k = str6;
            }
            if ((i7 & 2048) == 0) {
                this.f68196l = "";
            } else {
                this.f68196l = str7;
            }
            if ((i7 & 4096) == 0) {
                this.f68197m = 0L;
            } else {
                this.f68197m = j8;
            }
            if ((i7 & 8192) == 0) {
                this.f68198n = false;
            } else {
                this.f68198n = z6;
            }
            this.f68199o = aVar;
            this.f68200p = (32768 & i7) == 0 ? new C7347a("", 2) : c7347a;
            this.f68201q = (65536 & i7) == 0 ? 0L : j9;
            if ((131072 & i7) == 0) {
                this.f68202r = 0;
            } else {
                this.f68202r = i8;
            }
            if ((262144 & i7) == 0) {
                this.f68203s = 0;
            } else {
                this.f68203s = i9;
            }
            if ((524288 & i7) == 0) {
                this.f68204t = "";
            } else {
                this.f68204t = str8;
            }
            this.f68205u = (i7 & AccessibilityNodeInfoCompat.ACTION_DISMISS) == 0 ? MapsKt.emptyMap() : map;
            this.f68206v = this.f68193i == null ? null : new com.bilibili.ogv.kmm.operation.inlinevideo.g(this.f68193i, this.f68194j, this.f68195k, this.f68196l, this.f68190e, this.f68197m, this.f68191f, this.f68188c, this.f68189d, this.f68198n, this.f68205u);
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final int a() {
            return this.f68203s;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        @NotNull
        public final String b() {
            return this.f68204t;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.f68191f;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final long d() {
            return this.f68201q;
        }

        @Override // com.bilibili.ogv.operation3.module.feedback.y
        public final int e() {
            return this.f68202r;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f68186a, cVar.f68186a) && Intrinsics.areEqual(this.f68187b, cVar.f68187b) && Intrinsics.areEqual(this.f68188c, cVar.f68188c) && Intrinsics.areEqual(this.f68189d, cVar.f68189d) && Intrinsics.areEqual(this.f68190e, cVar.f68190e) && this.f68191f == cVar.f68191f && Intrinsics.areEqual(this.f68192g, cVar.f68192g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f68193i, cVar.f68193i) && this.f68194j == cVar.f68194j && Intrinsics.areEqual(this.f68195k, cVar.f68195k) && Intrinsics.areEqual(this.f68196l, cVar.f68196l) && this.f68197m == cVar.f68197m && this.f68198n == cVar.f68198n && Intrinsics.areEqual(this.f68199o, cVar.f68199o) && Intrinsics.areEqual(this.f68200p, cVar.f68200p) && this.f68201q == cVar.f68201q && this.f68202r == cVar.f68202r && this.f68203s == cVar.f68203s && Intrinsics.areEqual(this.f68204t, cVar.f68204t) && Intrinsics.areEqual(this.f68205u, cVar.f68205u);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68205u;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final m getStatus() {
            return this.f68192g;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68190e;
        }

        public final int hashCode() {
            int iA = e0.a(z.a(C3554n0.a(E.a(E.a(E.a(E.a(this.f68186a.hashCode() * 31, 31, this.f68187b), 31, this.f68188c), 31, this.f68189d), 31, this.f68190e), 31, this.f68191f), 31, this.f68192g.f67982a), 31, this.h);
            com.bilibili.ogv.kmm.operation.inlinevideo.d dVar = this.f68193i;
            int iA2 = z.a(C3554n0.a(E.a(E.a((this.f68194j.hashCode() + ((iA + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.f68195k), 31, this.f68196l), 31, this.f68197m), 31, this.f68198n);
            com.bilibili.ogv.kmm.operation.api.a aVar = this.f68199o;
            return this.f68205u.hashCode() + E.a(I.a(this.f68203s, I.a(this.f68202r, C3554n0.a((this.f68200p.hashCode() + ((iA2 + (aVar == null ? 0 : aVar.f67977a.hashCode())) * 31)) * 31, 31, this.f68201q), 31), 31), 31, this.f68204t);
        }

        @NotNull
        public final String toString() {
            List<com.bilibili.ogv.kmm.operation.inlinefeed.y> list = this.h;
            Map<String, String> map = this.f68205u;
            StringBuilder sb = new StringBuilder("Item(subtitle=");
            sb.append(this.f68186a);
            sb.append(", v_cover=");
            sb.append(this.f68187b);
            sb.append(", title=");
            sb.append(this.f68188c);
            sb.append(", cover=");
            sb.append(this.f68189d);
            sb.append(", url=");
            sb.append(this.f68190e);
            sb.append(", season_id=");
            sb.append(this.f68191f);
            sb.append(", status=");
            sb.append(this.f68192g);
            sb.append(", tags=");
            sb.append(list);
            sb.append(", inline_info=");
            sb.append(this.f68193i);
            sb.append(", type=");
            sb.append(this.f68194j);
            sb.append(", spmid=");
            sb.append(this.f68195k);
            sb.append(", from_spmid=");
            sb.append(this.f68196l);
            sb.append(", ep_id=");
            sb.append(this.f68197m);
            sb.append(", hide_fullscreen=");
            sb.append(this.f68198n);
            sb.append(", badge_info=");
            sb.append(this.f68199o);
            sb.append(", button=");
            sb.append(this.f68200p);
            sb.append(", rcmd_oid=");
            sb.append(this.f68201q);
            sb.append(", rcmd_otype=");
            sb.append(this.f68202r);
            sb.append(", feedback_source=");
            sb.append(this.f68203s);
            sb.append(", feedback_content=");
            return C4665g.a(sb, this.f68204t, ", report=", map, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$d.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class d {

        @NotNull
        public static final b Companion = new b();

        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<c> f68209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f68215g;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.cinematicket.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0405a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0405a f68216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68217b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.cinematicket.a$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68216a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.cinematicket.CinemaTicketInline.ModuleData", (GeneratedSerializer) obj, 7);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("title_cover", true);
                pluginGeneratedSerialDescriptor.addElement("title_cover_night", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("delivery_module_report", true);
                pluginGeneratedSerialDescriptor.addElement("remaining_time", true);
                f68217b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                Object value = lazyArr[0].getValue();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{value, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[5].getValue(), sj0.d.f127269a};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                Duration duration;
                Map map;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                List list;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68217b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                int i8 = 4;
                List list2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), (Object) null);
                    duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, sj0.d.f127269a, (Object) null);
                    i7 = 127;
                    map = map2;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    Duration duration2 = null;
                    Map map3 = null;
                    strDecodeStringElement = null;
                    String strDecodeStringElement5 = null;
                    String strDecodeStringElement6 = null;
                    strDecodeStringElement2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                continue;
                            case 2:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                continue;
                            case 3:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                continue;
                            case 4:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i8);
                                i7 |= 16;
                                continue;
                            case 5:
                                map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), map3);
                                i7 |= 32;
                                continue;
                            case 6:
                                duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, sj0.d.f127269a, duration2);
                                i7 |= 64;
                                continue;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        i8 = 4;
                    }
                    String str = strDecodeStringElement6;
                    duration = duration2;
                    map = map3;
                    strDecodeStringElement3 = str;
                    strDecodeStringElement4 = strDecodeStringElement5;
                    list = list2;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i7, list, strDecodeStringElement, strDecodeStringElement4, strDecodeStringElement3, strDecodeStringElement2, map, duration);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68217b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68217b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), dVar.f68209a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = dVar.f68210b;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
                String str2 = dVar.f68211c;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str2, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, str2);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                String str3 = dVar.f68212d;
                if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str3, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str3);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                String str4 = dVar.f68213e;
                if (zShouldEncodeElementDefault4 || !Intrinsics.areEqual(str4, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, str4);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(dVar.f68214f, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), dVar.f68214f);
                }
                boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
                long j7 = dVar.f68215g;
                if (zShouldEncodeElementDefault5 || !Duration.equals-impl0(j7, Duration.Companion.getZERO-UwyO8pc())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, sj0.d.f127269a, Duration.box-impl(j7));
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/a$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return C0405a.f68216a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C2040s(5)), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2041t(6)), null};
        }

        public d(int i7, List list, String str, String str2, String str3, String str4, Map map, Duration duration) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, C0405a.f68217b);
            }
            this.f68209a = list;
            if ((i7 & 2) == 0) {
                this.f68210b = "";
            } else {
                this.f68210b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68211c = "";
            } else {
                this.f68211c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f68212d = "";
            } else {
                this.f68212d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f68213e = "";
            } else {
                this.f68213e = str4;
            }
            if ((i7 & 32) == 0) {
                this.f68214f = MapsKt.emptyMap();
            } else {
                this.f68214f = map;
            }
            this.f68215g = (i7 & 64) == 0 ? Duration.Companion.getZERO-UwyO8pc() : duration.unbox-impl();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f68209a, dVar.f68209a) && Intrinsics.areEqual(this.f68210b, dVar.f68210b) && Intrinsics.areEqual(this.f68211c, dVar.f68211c) && Intrinsics.areEqual(this.f68212d, dVar.f68212d) && Intrinsics.areEqual(this.f68213e, dVar.f68213e) && Intrinsics.areEqual(this.f68214f, dVar.f68214f) && Duration.equals-impl0(this.f68215g, dVar.f68215g);
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f68215g) + J2.g.a(E.a(E.a(E.a(E.a(this.f68209a.hashCode() * 31, 31, this.f68210b), 31, this.f68211c), 31, this.f68212d), 31, this.f68213e), this.f68214f, 31);
        }

        @NotNull
        public final String toString() {
            List<c> list = this.f68209a;
            Map<String, String> map = this.f68214f;
            String str = Duration.toString-impl(this.f68215g);
            StringBuilder sbA = M.a("ModuleData(items=", ", title_cover=", list);
            sbA.append(this.f68210b);
            sbA.append(", title_cover_night=");
            sbA.append(this.f68211c);
            sbA.append(", subtitle=");
            sbA.append(this.f68212d);
            sbA.append(", url=");
            C7416u.a(sbA, this.f68213e, ", delivery_module_report=", map, ", remaining_time=");
            return C8770a.a(sbA, str, ")");
        }
    }

    public a(int i7, String str, d dVar, long j7) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, C0403a.f68184b);
        }
        this.f68180a = str;
        this.f68181b = dVar;
        this.f68182c = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f68180a, aVar.f68180a) && Intrinsics.areEqual(this.f68181b, aVar.f68181b) && this.f68182c == aVar.f68182c;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68182c;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68180a;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68181b.f68213e;
    }

    public final int hashCode() {
        int iHashCode = this.f68180a.hashCode();
        return Long.hashCode(this.f68182c) + ((this.f68181b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CinemaTicketInline(type=");
        sb.append(this.f68180a);
        sb.append(", module_data=");
        sb.append(this.f68181b);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68182c, ")");
    }
}
