package com.bilibili.ogv.kmm.operation.feedrank;

import H3.o0;
import H3.p0;
import H3.q0;
import I.E;
import J2.g;
import K7.M;
import M6.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.d;
import com.bilibili.ogv.kmm.operation.api.j;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank.class */
@StabilityInferred(parameters = 0)
@ModuleTypeNames(names = {"SIMPLE_RANK", "SIMPLE_PLAYLIST"})
@Serializable
public final class FeedRank implements InterfaceC5118d, InterfaceC8453a, InterfaceC7871a, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68259f = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new o0(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f68262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68264e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<FeedRank> serializer() {
            return FeedRank$$serializer.f68265a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b {

        @NotNull
        public static final C0406b Companion = new C0406b();

        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.operation3.module.operablecard.a> f68267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final List<j> f68271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68273g;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68275b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.feedrank.FeedRank$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68274a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.feedrank.FeedRank.ModuleData", (GeneratedSerializer) obj, 7);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("bg_img", true);
                pluginGeneratedSerialDescriptor.addElement("headers", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("delivery_module_report", true);
                f68275b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                Object value = lazyArr[0].getValue();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{value, stringSerializer, stringSerializer, stringSerializer, lazyArr[4].getValue(), stringSerializer, lazyArr[6].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                Map map;
                List list;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68275b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                List list2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), (Object) null);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    i7 = 127;
                    list = list3;
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    Map map2 = null;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    strDecodeStringElement3 = null;
                    List list4 = null;
                    String strDecodeStringElement5 = null;
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
                                break;
                            case 2:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list4);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
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
                    List list5 = list4;
                    strDecodeStringElement4 = strDecodeStringElement5;
                    map = map2;
                    list = list5;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, list2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, list, strDecodeStringElement4, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68275b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68275b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), bVar.f68267a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = bVar.f68268b;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
                String str2 = bVar.f68269c;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str2, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, str2);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                String str3 = bVar.f68270d;
                if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str3, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str3);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(bVar.f68271e, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), bVar.f68271e);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                String str4 = bVar.f68272f;
                if (zShouldEncodeElementDefault4 || !Intrinsics.areEqual(str4, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, str4);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(bVar.f68273g, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), bVar.f68273g);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.feedrank.FeedRank$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank$b$b.class */
        public static final class C0406b {
            @NotNull
            public final KSerializer<b> serializer() {
                return a.f68274a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new p0(6)), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new q0(6)), null, LazyKt.lazy(lazyThreadSafetyMode, new A91.b(6))};
        }

        public b(int i7, List list, String str, String str2, String str3, List list2, String str4, Map map) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68275b);
            }
            this.f68267a = list;
            if ((i7 & 2) == 0) {
                this.f68268b = "";
            } else {
                this.f68268b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68269c = "";
            } else {
                this.f68269c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f68270d = "";
            } else {
                this.f68270d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f68271e = CollectionsKt.emptyList();
            } else {
                this.f68271e = list2;
            }
            if ((i7 & 32) == 0) {
                this.f68272f = "";
            } else {
                this.f68272f = str4;
            }
            if ((i7 & 64) == 0) {
                this.f68273g = MapsKt.emptyMap();
            } else {
                this.f68273g = map;
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
            return Intrinsics.areEqual(this.f68267a, bVar.f68267a) && Intrinsics.areEqual(this.f68268b, bVar.f68268b) && Intrinsics.areEqual(this.f68269c, bVar.f68269c) && Intrinsics.areEqual(this.f68270d, bVar.f68270d) && Intrinsics.areEqual(this.f68271e, bVar.f68271e) && Intrinsics.areEqual(this.f68272f, bVar.f68272f) && Intrinsics.areEqual(this.f68273g, bVar.f68273g);
        }

        public final int hashCode() {
            return this.f68273g.hashCode() + E.a(e0.a(E.a(E.a(E.a(this.f68267a.hashCode() * 31, 31, this.f68268b), 31, this.f68269c), 31, this.f68270d), 31, this.f68271e), 31, this.f68272f);
        }

        @NotNull
        public final String toString() {
            List<com.bilibili.ogv.operation3.module.operablecard.a> list = this.f68267a;
            List<j> list2 = this.f68271e;
            Map<String, String> map = this.f68273g;
            StringBuilder sbA = M.a("ModuleData(items=", ", url=", list);
            sbA.append(this.f68268b);
            sbA.append(", title=");
            sbA.append(this.f68269c);
            sbA.append(", bg_img=");
            f.a(this.f68270d, ", headers=", ", subtitle=", sbA, list2);
            return C4665g.a(sbA, this.f68272f, ", delivery_module_report=", map, ")");
        }
    }

    public FeedRank(int i7, String str, String str2, b bVar, Map map, long j7) {
        if (21 != (i7 & 21)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 21, FeedRank$$serializer.f68266b);
        }
        this.f68260a = str;
        if ((i7 & 2) == 0) {
            this.f68261b = "";
        } else {
            this.f68261b = str2;
        }
        this.f68262c = bVar;
        if ((i7 & 8) == 0) {
            this.f68263d = MapsKt.emptyMap();
        } else {
            this.f68263d = map;
        }
        this.f68264e = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedRank)) {
            return false;
        }
        FeedRank feedRank = (FeedRank) obj;
        return Intrinsics.areEqual(this.f68260a, feedRank.f68260a) && Intrinsics.areEqual(this.f68261b, feedRank.f68261b) && Intrinsics.areEqual(this.f68262c, feedRank.f68262c) && Intrinsics.areEqual(this.f68263d, feedRank.f68263d) && this.f68264e == feedRank.f68264e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String f() {
        return Intrinsics.areEqual(this.f68260a, "SIMPLE_RANK") ? "pgc.{pageName}.recom-multicard.card.show" : "pgc.{pageName}.recom-playlist.card.show";
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String getClickEventId() {
        return Intrinsics.areEqual(this.f68260a, "SIMPLE_RANK") ? "pgc.{pageName}.recom-multicard.card.click" : "pgc.{pageName}.recom-playlist.card.click";
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68264e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68263d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68260a;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68262c.f68268b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68264e) + g.a((this.f68262c.hashCode() + E.a(this.f68260a.hashCode() * 31, 31, this.f68261b)) * 31, this.f68263d, 31);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68263d;
        StringBuilder sb = new StringBuilder("FeedRank(type=");
        sb.append(this.f68260a);
        sb.append(", title=");
        sb.append(this.f68261b);
        sb.append(", module_data=");
        sb.append(this.f68262c);
        sb.append(", report=");
        sb.append(map);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68264e, ")");
    }
}
