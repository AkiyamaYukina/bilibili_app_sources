package com.bilibili.ogv.filmlist.api;

import F3.A5;
import F3.C1873y5;
import F3.C1880z5;
import I.E;
import J2.g;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.ogv.filmlist.api.d;
import com.bilibili.ogv.operation3.module.followable.j;
import com.bilibili.ogv.operation3.module.followable.l;
import com.bilibili.ogv.operation3.module.followable.m;
import dl0.C6822c;
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
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class c implements InterfaceC8453a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f67638q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<C0393c> f67640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f67642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f67643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f67644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f67645g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f67646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f67647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f67648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f67649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f67651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final d f67652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f67653p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f67654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f67655b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.filmlist.api.c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f67654a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.filmlist.api.FilmListData", (GeneratedSerializer) obj, 16);
            pluginGeneratedSerialDescriptor.addElement("id", true);
            pluginGeneratedSerialDescriptor.addElement("seasons", true);
            pluginGeneratedSerialDescriptor.addElement("is_favorite", true);
            pluginGeneratedSerialDescriptor.addElement("summary", true);
            pluginGeneratedSerialDescriptor.addElement("cover", true);
            pluginGeneratedSerialDescriptor.addElement("bg_cover", true);
            pluginGeneratedSerialDescriptor.addElement("bg_h_cover", true);
            pluginGeneratedSerialDescriptor.addElement("share_url", true);
            pluginGeneratedSerialDescriptor.addElement("share_subtitle", true);
            pluginGeneratedSerialDescriptor.addElement("topic_link", true);
            pluginGeneratedSerialDescriptor.addElement("square_url", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("percent", true);
            pluginGeneratedSerialDescriptor.addElement("watched_text", true);
            pluginGeneratedSerialDescriptor.addElement("upInfo", false);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f67655b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = c.f67638q;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, lazyArr[1].getValue(), C8595a.f127260a, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(d.a.f67680a), lazyArr[15].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            String strDecodeStringElement3;
            String strDecodeStringElement4;
            String strDecodeStringElement5;
            boolean zBooleanValue;
            int iDecodeIntElement;
            int i7;
            List list;
            String strDecodeStringElement6;
            String strDecodeStringElement7;
            Map map;
            d dVar;
            String strDecodeStringElement8;
            String str;
            String strDecodeStringElement9;
            String strDecodeStringElement10;
            int i8;
            int i9;
            int i10;
            int i11;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67655b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c.f67638q;
            int i12 = 8;
            int i13 = 4;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 10);
                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 12);
                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 13);
                dVar = (d) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, d.a.f67680a, (Object) null);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), (Object) null);
                i7 = 65535;
                strDecodeStringElement5 = strDecodeStringElement11;
                str = strDecodeStringElement12;
            } else {
                int i14 = 15;
                boolean z6 = true;
                Map map2 = null;
                d dVar2 = null;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                strDecodeStringElement3 = null;
                strDecodeStringElement4 = null;
                strDecodeStringElement5 = null;
                String strDecodeStringElement13 = null;
                String strDecodeStringElement14 = null;
                String strDecodeStringElement15 = null;
                String strDecodeStringElement16 = null;
                String strDecodeStringElement17 = null;
                String strDecodeStringElement18 = null;
                zBooleanValue = false;
                iDecodeIntElement = 0;
                i7 = 0;
                list = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            i12 = 8;
                            break;
                        case 0:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i8 = i7;
                            i9 = 1;
                            i7 = i8 | i9;
                            i14 = 15;
                            i12 = 8;
                            i13 = 4;
                            break;
                        case 1:
                            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list);
                            i8 = i7;
                            i9 = 2;
                            i7 = i8 | i9;
                            i14 = 15;
                            i12 = 8;
                            i13 = 4;
                            break;
                        case 2:
                            zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                            i8 = i7;
                            i9 = 4;
                            i7 = i8 | i9;
                            i14 = 15;
                            i12 = 8;
                            i13 = 4;
                            break;
                        case 3:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                            i14 = 15;
                            break;
                        case 4:
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i13);
                            i10 = i7;
                            i11 = 16;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 5:
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                            i10 = i7;
                            i11 = 32;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 6:
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i10 = i7;
                            i11 = 64;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 7:
                            strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                            i10 = i7;
                            i11 = 128;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 8:
                            strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i12);
                            i10 = i7;
                            i11 = 256;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 9:
                            strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                            i10 = i7;
                            i11 = 512;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 10:
                            strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 10);
                            i10 = i7;
                            i11 = 1024;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 11:
                            strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                            i10 = i7;
                            i11 = 2048;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 12:
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 12);
                            i10 = i7;
                            i11 = 4096;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 13:
                            strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 13);
                            i10 = i7;
                            i11 = 8192;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 14:
                            dVar2 = (d) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, d.a.f67680a, dVar2);
                            i10 = i7;
                            i11 = 16384;
                            i7 = i10 | i11;
                            i14 = 15;
                            break;
                        case 15:
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i14, (DeserializationStrategy) lazyArr[i14].getValue(), map2);
                            i7 |= 32768;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                String str2 = strDecodeStringElement13;
                String str3 = strDecodeStringElement14;
                String str4 = strDecodeStringElement15;
                strDecodeStringElement6 = strDecodeStringElement17;
                strDecodeStringElement7 = strDecodeStringElement18;
                map = map2;
                dVar = dVar2;
                strDecodeStringElement8 = strDecodeStringElement16;
                str = str4;
                strDecodeStringElement9 = str3;
                strDecodeStringElement10 = str2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new c(i7, strDecodeStringElement, list, zBooleanValue, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement10, strDecodeStringElement9, str, strDecodeStringElement8, strDecodeStringElement6, iDecodeIntElement, strDecodeStringElement7, dVar, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f67655b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            c cVar = (c) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67655b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = c.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(cVar.f67639a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f67639a);
            }
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
            Lazy<KSerializer<Object>>[] lazyArr = c.f67638q;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(cVar.f67640b, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), cVar.f67640b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || cVar.f67641c) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(cVar.f67641c));
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(cVar.f67642d, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, cVar.f67642d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(cVar.f67643e, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, cVar.f67643e);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(cVar.f67644f, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, cVar.f67644f);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(cVar.f67645g, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, cVar.f67645g);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(cVar.h, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, cVar.h);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(cVar.f67646i, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, cVar.f67646i);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(cVar.f67647j, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, cVar.f67647j);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || !Intrinsics.areEqual(cVar.f67648k, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 10, cVar.f67648k);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11) || !Intrinsics.areEqual(cVar.f67649l, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 11, cVar.f67649l);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12) || cVar.f67650m != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 12, cVar.f67650m);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || !Intrinsics.areEqual(cVar.f67651n, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 13, cVar.f67651n);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 14, d.a.f67680a, cVar.f67652o);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 15) || !Intrinsics.areEqual(cVar.f67653p, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), cVar.f67653p);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<c> serializer() {
            return a.f67654a;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.api.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class C0393c implements InterfaceC7871a, InterfaceC8453a, j, l {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f67656s = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new A5(9)), null, null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f67658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f67659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f67660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f67661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f67662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f67663g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f67664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f67665j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f67666k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f67667l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final String f67668m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final String f67669n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f67670o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f67671p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final String f67672q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final String f67673r;

        /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.api.c$c$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<C0393c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f67674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f67675b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.filmlist.api.c$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f67674a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.filmlist.api.FilmListData.SeasonItem", (GeneratedSerializer) obj, 18);
                pluginGeneratedSerialDescriptor.addElement("season_id", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("celebrities", true);
                pluginGeneratedSerialDescriptor.addElement("button_text", true);
                pluginGeneratedSerialDescriptor.addElement("season_type", true);
                pluginGeneratedSerialDescriptor.addElement("percent", true);
                pluginGeneratedSerialDescriptor.addElement("styles", true);
                pluginGeneratedSerialDescriptor.addElement("rank_label", true);
                pluginGeneratedSerialDescriptor.addElement("rating_score", true);
                pluginGeneratedSerialDescriptor.addElement("follow", true);
                pluginGeneratedSerialDescriptor.addElement("copyright", true);
                pluginGeneratedSerialDescriptor.addElement(Constant.IN_KEY_REASON, true);
                pluginGeneratedSerialDescriptor.addElement("link", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                pluginGeneratedSerialDescriptor.addElement("media_id", true);
                pluginGeneratedSerialDescriptor.addElement("clickEventId", true);
                pluginGeneratedSerialDescriptor.addElement("exposureEventId", true);
                f67675b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = C0393c.f67656s;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                C8595a c8595a = C8595a.f127260a;
                return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, c8595a, c8595a, stringSerializer, stringSerializer, lazyArr[14].getValue(), longSerializer, stringSerializer, stringSerializer};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                String strDecodeStringElement5;
                long jDecodeLongElement;
                int iDecodeIntElement;
                boolean zBooleanValue;
                String str;
                String strDecodeStringElement6;
                String strDecodeStringElement7;
                Map map;
                String strDecodeStringElement8;
                boolean z6;
                String strDecodeStringElement9;
                String str2;
                int iDecodeIntElement2;
                long jDecodeLongElement2;
                int i7;
                int i8;
                int i9;
                int i10;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67675b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = C0393c.f67656s;
                int i11 = 3;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 6);
                    String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                    String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                    strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                    C8595a c8595a = C8595a.f127260a;
                    Boolean bool = Boolean.FALSE;
                    boolean zBooleanValue2 = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, c8595a, bool)).booleanValue();
                    zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 11, c8595a, bool)).booleanValue();
                    strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 12);
                    String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 13);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), (Object) null);
                    long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 15);
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 16);
                    strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 17);
                    i7 = 262143;
                    strDecodeStringElement4 = strDecodeStringElement10;
                    strDecodeStringElement5 = strDecodeStringElement11;
                    str2 = strDecodeStringElement12;
                    z6 = zBooleanValue2;
                    str = strDecodeStringElement13;
                    jDecodeLongElement = jDecodeLongElement3;
                } else {
                    int i12 = 17;
                    boolean z7 = true;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    strDecodeStringElement3 = null;
                    strDecodeStringElement4 = null;
                    strDecodeStringElement5 = null;
                    String strDecodeStringElement14 = null;
                    String strDecodeStringElement15 = null;
                    String strDecodeStringElement16 = null;
                    String strDecodeStringElement17 = null;
                    String strDecodeStringElement18 = null;
                    String strDecodeStringElement19 = null;
                    int i13 = 0;
                    boolean zBooleanValue3 = false;
                    jDecodeLongElement = 0;
                    long jDecodeLongElement4 = 0;
                    iDecodeIntElement = 0;
                    zBooleanValue = false;
                    int iDecodeIntElement3 = 0;
                    Map map2 = null;
                    while (z7) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z7 = false;
                                i8 = i13;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 0:
                                jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                i8 = i13 | 1;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i8 = i13 | 2;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 2:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i13 |= 4;
                                i12 = 17;
                                break;
                            case 3:
                                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i11);
                                i9 = i13;
                                i10 = 8;
                                i13 = i9 | i10;
                                i12 = 17;
                                break;
                            case 4:
                                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i8 = i13 | 16;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 5:
                                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                                i8 = i13 | 32;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 6:
                                iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 6);
                                i8 = i13 | 64;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 7:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                                i8 = i13 | 128;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 8:
                                strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                                i8 = i13 | 256;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 9:
                                strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                                i8 = i13 | 512;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 10:
                                zBooleanValue3 = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, C8595a.f127260a, Boolean.valueOf(zBooleanValue3))).booleanValue();
                                i8 = i13 | 1024;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 11:
                                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 11, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                                i8 = i13 | 2048;
                                i12 = 17;
                                i13 = i8;
                                i11 = 3;
                                break;
                            case 12:
                                strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 12);
                                i9 = i13;
                                i10 = 4096;
                                i13 = i9 | i10;
                                i12 = 17;
                                break;
                            case 13:
                                strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 13);
                                i9 = i13;
                                i10 = 8192;
                                i13 = i9 | i10;
                                i12 = 17;
                                break;
                            case 14:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), map2);
                                i9 = i13;
                                i10 = 16384;
                                i13 = i9 | i10;
                                i12 = 17;
                                break;
                            case 15:
                                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 15);
                                i9 = i13;
                                i10 = 32768;
                                i13 = i9 | i10;
                                i12 = 17;
                                break;
                            case 16:
                                strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 16);
                                i13 |= 65536;
                                break;
                            case 17:
                                strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i12);
                                i13 |= 131072;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str3 = strDecodeStringElement14;
                    String str4 = strDecodeStringElement15;
                    String str5 = strDecodeStringElement16;
                    str = strDecodeStringElement17;
                    strDecodeStringElement6 = strDecodeStringElement18;
                    strDecodeStringElement7 = strDecodeStringElement19;
                    map = map2;
                    strDecodeStringElement8 = str5;
                    z6 = zBooleanValue3;
                    strDecodeStringElement9 = str4;
                    str2 = str3;
                    iDecodeIntElement2 = iDecodeIntElement3;
                    jDecodeLongElement2 = jDecodeLongElement4;
                    i7 = i13;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new C0393c(i7, jDecodeLongElement2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, iDecodeIntElement, iDecodeIntElement2, strDecodeStringElement5, str2, strDecodeStringElement9, z6, zBooleanValue, strDecodeStringElement8, str, map, jDecodeLongElement, strDecodeStringElement6, strDecodeStringElement7);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f67675b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                C0393c c0393c = (C0393c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67675b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = C0393c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || c0393c.f67657a != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, c0393c.f67657a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(c0393c.f67658b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0393c.f67658b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(c0393c.f67659c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, c0393c.f67659c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(c0393c.f67660d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, c0393c.f67660d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(c0393c.f67661e, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, c0393c.f67661e);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || c0393c.f67662f != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 5, c0393c.f67662f);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || c0393c.f67663g != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 6, c0393c.f67663g);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(c0393c.h, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, c0393c.h);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(c0393c.f67664i, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, c0393c.f67664i);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(c0393c.f67665j, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, c0393c.f67665j);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || c0393c.f67666k) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, C8595a.f127260a, Boolean.valueOf(c0393c.f67666k));
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11) || c0393c.f67667l) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 11, C8595a.f127260a, Boolean.valueOf(c0393c.f67667l));
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12) || !Intrinsics.areEqual(c0393c.f67668m, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 12, c0393c.f67668m);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || !Intrinsics.areEqual(c0393c.f67669n, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 13, c0393c.f67669n);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 14) || !Intrinsics.areEqual(c0393c.f67670o, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 14, (SerializationStrategy) C0393c.f67656s[14].getValue(), c0393c.f67670o);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 15) || c0393c.f67671p != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 15, c0393c.f67671p);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 16) || !Intrinsics.areEqual(c0393c.f67672q, "pgc.operation-playlist.list.works.click")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 16, c0393c.f67672q);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 17) || !Intrinsics.areEqual(c0393c.f67673r, "pgc.operation-playlist.list.works.show")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 17, c0393c.f67673r);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.api.c$c$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/api/c$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<C0393c> serializer() {
                return a.f67674a;
            }
        }

        public C0393c() {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f67657a = 0L;
            this.f67658b = "";
            this.f67659c = "";
            this.f67660d = "";
            this.f67661e = "";
            this.f67662f = 0;
            this.f67663g = 0;
            this.h = "";
            this.f67664i = "";
            this.f67665j = "";
            this.f67666k = false;
            this.f67667l = false;
            this.f67668m = "";
            this.f67669n = "";
            this.f67670o = mapEmptyMap;
            this.f67671p = 0L;
            this.f67672q = "pgc.operation-playlist.list.works.click";
            this.f67673r = "pgc.operation-playlist.list.works.show";
        }

        public C0393c(int i7, long j7, String str, String str2, String str3, String str4, int i8, int i9, String str5, String str6, String str7, boolean z6, boolean z7, String str8, String str9, Map map, long j8, String str10, String str11) {
            if ((i7 & 1) == 0) {
                this.f67657a = 0L;
            } else {
                this.f67657a = j7;
            }
            if ((i7 & 2) == 0) {
                this.f67658b = "";
            } else {
                this.f67658b = str;
            }
            if ((i7 & 4) == 0) {
                this.f67659c = "";
            } else {
                this.f67659c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f67660d = "";
            } else {
                this.f67660d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f67661e = "";
            } else {
                this.f67661e = str4;
            }
            if ((i7 & 32) == 0) {
                this.f67662f = 0;
            } else {
                this.f67662f = i8;
            }
            if ((i7 & 64) == 0) {
                this.f67663g = 0;
            } else {
                this.f67663g = i9;
            }
            if ((i7 & 128) == 0) {
                this.h = "";
            } else {
                this.h = str5;
            }
            if ((i7 & 256) == 0) {
                this.f67664i = "";
            } else {
                this.f67664i = str6;
            }
            if ((i7 & 512) == 0) {
                this.f67665j = "";
            } else {
                this.f67665j = str7;
            }
            if ((i7 & 1024) == 0) {
                this.f67666k = false;
            } else {
                this.f67666k = z6;
            }
            if ((i7 & 2048) == 0) {
                this.f67667l = false;
            } else {
                this.f67667l = z7;
            }
            if ((i7 & 4096) == 0) {
                this.f67668m = "";
            } else {
                this.f67668m = str8;
            }
            if ((i7 & 8192) == 0) {
                this.f67669n = "";
            } else {
                this.f67669n = str9;
            }
            this.f67670o = (i7 & 16384) == 0 ? MapsKt.emptyMap() : map;
            if ((32768 & i7) == 0) {
                this.f67671p = 0L;
            } else {
                this.f67671p = j8;
            }
            this.f67672q = (65536 & i7) == 0 ? "pgc.operation-playlist.list.works.click" : str10;
            this.f67673r = (i7 & 131072) == 0 ? "pgc.operation-playlist.list.works.show" : str11;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.j
        public final long a() {
            return this.f67671p;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.f67657a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0393c)) {
                return false;
            }
            C0393c c0393c = (C0393c) obj;
            return this.f67657a == c0393c.f67657a && Intrinsics.areEqual(this.f67658b, c0393c.f67658b) && Intrinsics.areEqual(this.f67659c, c0393c.f67659c) && Intrinsics.areEqual(this.f67660d, c0393c.f67660d) && Intrinsics.areEqual(this.f67661e, c0393c.f67661e) && this.f67662f == c0393c.f67662f && this.f67663g == c0393c.f67663g && Intrinsics.areEqual(this.h, c0393c.h) && Intrinsics.areEqual(this.f67664i, c0393c.f67664i) && Intrinsics.areEqual(this.f67665j, c0393c.f67665j) && this.f67666k == c0393c.f67666k && this.f67667l == c0393c.f67667l && Intrinsics.areEqual(this.f67668m, c0393c.f67668m) && Intrinsics.areEqual(this.f67669n, c0393c.f67669n) && Intrinsics.areEqual(this.f67670o, c0393c.f67670o) && this.f67671p == c0393c.f67671p;
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String f() {
            return this.f67673r;
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String getClickEventId() {
            return this.f67672q;
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f67670o;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.j, com.bilibili.ogv.operation3.module.followable.l
        @NotNull
        public final m getStatus() {
            return new C6822c(this.f67666k);
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f67669n;
        }

        public final int hashCode() {
            return Long.hashCode(this.f67671p) + g.a(E.a(E.a(z.a(z.a(E.a(E.a(E.a(I.a(this.f67663g, I.a(this.f67662f, E.a(E.a(E.a(E.a(Long.hashCode(this.f67657a) * 31, 31, this.f67658b), 31, this.f67659c), 31, this.f67660d), 31, this.f67661e), 31), 31), 31, this.h), 31, this.f67664i), 31, this.f67665j), 31, this.f67666k), 31, this.f67667l), 31, this.f67668m), 31, this.f67669n), this.f67670o, 31);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f67670o;
            StringBuilder sb = new StringBuilder("SeasonItem(season_id=");
            sb.append(this.f67657a);
            sb.append(", title=");
            sb.append(this.f67658b);
            sb.append(", cover=");
            sb.append(this.f67659c);
            sb.append(", celebrities=");
            sb.append(this.f67660d);
            sb.append(", button_text=");
            sb.append(this.f67661e);
            sb.append(", season_type=");
            sb.append(this.f67662f);
            sb.append(", percent=");
            sb.append(this.f67663g);
            sb.append(", styles=");
            sb.append(this.h);
            sb.append(", rank_label=");
            sb.append(this.f67664i);
            sb.append(", rating_score=");
            sb.append(this.f67665j);
            sb.append(", follow=");
            sb.append(this.f67666k);
            sb.append(", biliHasCopyright=");
            sb.append(this.f67667l);
            sb.append(", reason=");
            sb.append(this.f67668m);
            sb.append(", url=");
            C7416u.a(sb, this.f67669n, ", report=", map, ", media_id=");
            return android.support.v4.media.session.a.a(sb, this.f67671p, ")");
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f67638q = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new C1873y5(8)), null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C1880z5(5))};
    }

    public c(int i7, String str, List list, boolean z6, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, String str11, d dVar, Map map) {
        if (16384 != (i7 & 16384)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 16384, a.f67655b);
        }
        if ((i7 & 1) == 0) {
            this.f67639a = "";
        } else {
            this.f67639a = str;
        }
        this.f67640b = (i7 & 2) == 0 ? CollectionsKt.emptyList() : list;
        if ((i7 & 4) == 0) {
            this.f67641c = false;
        } else {
            this.f67641c = z6;
        }
        if ((i7 & 8) == 0) {
            this.f67642d = "";
        } else {
            this.f67642d = str2;
        }
        if ((i7 & 16) == 0) {
            this.f67643e = "";
        } else {
            this.f67643e = str3;
        }
        if ((i7 & 32) == 0) {
            this.f67644f = "";
        } else {
            this.f67644f = str4;
        }
        if ((i7 & 64) == 0) {
            this.f67645g = "";
        } else {
            this.f67645g = str5;
        }
        if ((i7 & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i7 & 256) == 0) {
            this.f67646i = "";
        } else {
            this.f67646i = str7;
        }
        if ((i7 & 512) == 0) {
            this.f67647j = "";
        } else {
            this.f67647j = str8;
        }
        if ((i7 & 1024) == 0) {
            this.f67648k = "";
        } else {
            this.f67648k = str9;
        }
        if ((i7 & 2048) == 0) {
            this.f67649l = "";
        } else {
            this.f67649l = str10;
        }
        if ((i7 & 4096) == 0) {
            this.f67650m = 0;
        } else {
            this.f67650m = i8;
        }
        if ((i7 & 8192) == 0) {
            this.f67651n = "";
        } else {
            this.f67651n = str11;
        }
        this.f67652o = dVar;
        this.f67653p = (i7 & 32768) == 0 ? MapsKt.emptyMap() : map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f67639a, cVar.f67639a) && Intrinsics.areEqual(this.f67640b, cVar.f67640b) && this.f67641c == cVar.f67641c && Intrinsics.areEqual(this.f67642d, cVar.f67642d) && Intrinsics.areEqual(this.f67643e, cVar.f67643e) && Intrinsics.areEqual(this.f67644f, cVar.f67644f) && Intrinsics.areEqual(this.f67645g, cVar.f67645g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f67646i, cVar.f67646i) && Intrinsics.areEqual(this.f67647j, cVar.f67647j) && Intrinsics.areEqual(this.f67648k, cVar.f67648k) && Intrinsics.areEqual(this.f67649l, cVar.f67649l) && this.f67650m == cVar.f67650m && Intrinsics.areEqual(this.f67651n, cVar.f67651n) && Intrinsics.areEqual(this.f67652o, cVar.f67652o) && Intrinsics.areEqual(this.f67653p, cVar.f67653p);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f67653p;
    }

    public final int hashCode() {
        int iA = E.a(I.a(this.f67650m, E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(z.a(e0.a(this.f67639a.hashCode() * 31, 31, this.f67640b), 31, this.f67641c), 31, this.f67642d), 31, this.f67643e), 31, this.f67644f), 31, this.f67645g), 31, this.h), 31, this.f67646i), 31, this.f67647j), 31, this.f67648k), 31, this.f67649l), 31), 31, this.f67651n);
        d dVar = this.f67652o;
        return this.f67653p.hashCode() + ((iA + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        List<C0393c> list = this.f67640b;
        Map<String, String> map = this.f67653p;
        StringBuilder sb = new StringBuilder("FilmListData(id=");
        f.a(this.f67639a, ", seasons=", ", is_favorite=", sb, list);
        sb.append(this.f67641c);
        sb.append(", summary=");
        sb.append(this.f67642d);
        sb.append(", cover=");
        sb.append(this.f67643e);
        sb.append(", bg_cover=");
        sb.append(this.f67644f);
        sb.append(", bg_h_cover=");
        sb.append(this.f67645g);
        sb.append(", share_url=");
        sb.append(this.h);
        sb.append(", share_subtitle=");
        sb.append(this.f67646i);
        sb.append(", topic_link=");
        sb.append(this.f67647j);
        sb.append(", square_url=");
        sb.append(this.f67648k);
        sb.append(", title=");
        sb.append(this.f67649l);
        sb.append(", percent=");
        sb.append(this.f67650m);
        sb.append(", watched_text=");
        sb.append(this.f67651n);
        sb.append(", upper=");
        sb.append(this.f67652o);
        sb.append(", report=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
