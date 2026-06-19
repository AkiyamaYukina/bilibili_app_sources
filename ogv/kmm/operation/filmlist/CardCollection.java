package com.bilibili.ogv.kmm.operation.filmlist;

import I.E;
import J2.g;
import K7.M;
import M3.C2614r1;
import M3.C2617s1;
import M3.C2620t1;
import M3.C2623u1;
import M6.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.d;
import com.bilibili.ogv.kmm.operation.api.j;
import com.bilibili.ogv.kmm.operation.api.l;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection.class */
@StabilityInferred(parameters = 0)
@ModuleTypeNames(names = {"FOLLOW_C", "FOLLOW_V", "RANK_CARD", "COMMON_PLAYLIST"})
@Serializable
public final class CardCollection implements InterfaceC5118d, InterfaceC8453a, InterfaceC7871a, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68276f = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C2614r1(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f68278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68281e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<CardCollection> serializer() {
            return CardCollection$$serializer.f68282a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b {

        @NotNull
        public static final C0407b Companion = new C0407b();

        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.operation3.module.operablecard.a> f68284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<j> f68286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final l f68289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68290g;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68292b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.filmlist.CardCollection$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68291a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.filmlist.CardCollection.ModuleData", (GeneratedSerializer) obj, 7);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("headers", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("description", true);
                pluginGeneratedSerialDescriptor.addElement("upper", true);
                pluginGeneratedSerialDescriptor.addElement("delivery_module_report", true);
                f68292b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                Object value = lazyArr[0].getValue();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{value, stringSerializer, lazyArr[2].getValue(), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(l.a.f68015a), lazyArr[6].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                Map map;
                List list;
                l lVar;
                String strDecodeStringElement3;
                List list2;
                int i8;
                int i9;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68292b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                int i10 = 4;
                List list3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    lVar = (l) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, l.a.f68015a, (Object) null);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
                    i7 = 127;
                    strDecodeStringElement2 = strDecodeStringElement4;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    Map map2 = null;
                    l lVar2 = null;
                    strDecodeStringElement = null;
                    List list4 = null;
                    String strDecodeStringElement5 = null;
                    strDecodeStringElement2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                i10 = 4;
                                break;
                            case 0:
                                list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                                i7 |= 1;
                                i10 = 4;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i8 = i7;
                                i9 = 2;
                                i7 = i8 | i9;
                                i10 = 4;
                                break;
                            case 2:
                                list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list4);
                                i8 = i7;
                                i9 = 4;
                                i7 = i8 | i9;
                                i10 = 4;
                                break;
                            case 3:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i10);
                                i7 |= 16;
                                break;
                            case 5:
                                lVar2 = (l) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, l.a.f68015a, lVar2);
                                i7 |= 32;
                                break;
                            case 6:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), map2);
                                i7 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    map = map2;
                    l lVar3 = lVar2;
                    list = list4;
                    lVar = lVar3;
                    strDecodeStringElement3 = strDecodeStringElement5;
                    list2 = list3;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, list2, strDecodeStringElement, list, strDecodeStringElement3, strDecodeStringElement2, lVar, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68292b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68292b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), bVar.f68284a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = bVar.f68285b;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(bVar.f68286c, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), bVar.f68286c);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                String str2 = bVar.f68287d;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str2, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str2);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                String str3 = bVar.f68288e;
                if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str3, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, str3);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                l lVar = bVar.f68289f;
                if (zShouldEncodeElementDefault4 || lVar != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, l.a.f68015a, lVar);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(bVar.f68290g, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), bVar.f68290g);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.filmlist.CardCollection$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection$b$b.class */
        public static final class C0407b {
            @NotNull
            public final KSerializer<b> serializer() {
                return a.f68291a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C2617s1(3)), null, LazyKt.lazy(lazyThreadSafetyMode, new C2620t1(4)), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2623u1(4))};
        }

        public b(int i7, List list, String str, List list2, String str2, String str3, l lVar, Map map) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68292b);
            }
            this.f68284a = list;
            if ((i7 & 2) == 0) {
                this.f68285b = "";
            } else {
                this.f68285b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68286c = CollectionsKt.emptyList();
            } else {
                this.f68286c = list2;
            }
            if ((i7 & 8) == 0) {
                this.f68287d = "";
            } else {
                this.f68287d = str2;
            }
            if ((i7 & 16) == 0) {
                this.f68288e = "";
            } else {
                this.f68288e = str3;
            }
            if ((i7 & 32) == 0) {
                this.f68289f = null;
            } else {
                this.f68289f = lVar;
            }
            if ((i7 & 64) == 0) {
                this.f68290g = MapsKt.emptyMap();
            } else {
                this.f68290g = map;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f68284a, bVar.f68284a) && Intrinsics.areEqual(this.f68285b, bVar.f68285b) && Intrinsics.areEqual(this.f68286c, bVar.f68286c) && Intrinsics.areEqual(this.f68287d, bVar.f68287d) && Intrinsics.areEqual(this.f68288e, bVar.f68288e) && Intrinsics.areEqual(this.f68289f, bVar.f68289f) && Intrinsics.areEqual(this.f68290g, bVar.f68290g);
        }

        public final int hashCode() {
            int iA = E.a(E.a(e0.a(E.a(this.f68284a.hashCode() * 31, 31, this.f68285b), 31, this.f68286c), 31, this.f68287d), 31, this.f68288e);
            l lVar = this.f68289f;
            return this.f68290g.hashCode() + ((iA + (lVar == null ? 0 : lVar.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            List<com.bilibili.ogv.operation3.module.operablecard.a> list = this.f68284a;
            List<j> list2 = this.f68286c;
            Map<String, String> map = this.f68290g;
            StringBuilder sbA = M.a("ModuleData(items=", ", url=", list);
            f.a(this.f68285b, ", headers=", ", subtitle=", sbA, list2);
            sbA.append(this.f68287d);
            sbA.append(", description=");
            sbA.append(this.f68288e);
            sbA.append(", upper=");
            sbA.append(this.f68289f);
            sbA.append(", delivery_module_report=");
            sbA.append(map);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public CardCollection(int i7, String str, b bVar, String str2, Map map, long j7) {
        if (23 != (i7 & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 23, CardCollection$$serializer.f68283b);
        }
        this.f68277a = str;
        this.f68278b = bVar;
        this.f68279c = str2;
        if ((i7 & 8) == 0) {
            this.f68280d = MapsKt.emptyMap();
        } else {
            this.f68280d = map;
        }
        this.f68281e = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardCollection)) {
            return false;
        }
        CardCollection cardCollection = (CardCollection) obj;
        return Intrinsics.areEqual(this.f68277a, cardCollection.f68277a) && Intrinsics.areEqual(this.f68278b, cardCollection.f68278b) && Intrinsics.areEqual(this.f68279c, cardCollection.f68279c) && Intrinsics.areEqual(this.f68280d, cardCollection.f68280d) && this.f68281e == cardCollection.f68281e;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68281e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68280d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68279c;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68278b.f68285b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68281e) + g.a(E.a((this.f68278b.hashCode() + (this.f68277a.hashCode() * 31)) * 31, 31, this.f68279c), this.f68280d, 31);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68280d;
        StringBuilder sb = new StringBuilder("CardCollection(title=");
        sb.append(this.f68277a);
        sb.append(", module_data=");
        sb.append(this.f68278b);
        sb.append(", type=");
        C7416u.a(sb, this.f68279c, ", report=", map, ", id=");
        return android.support.v4.media.session.a.a(sb, this.f68281e, ")");
    }
}
