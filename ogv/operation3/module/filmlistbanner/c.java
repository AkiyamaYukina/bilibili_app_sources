package com.bilibili.ogv.operation3.module.filmlistbanner;

import I.E;
import J3.M1;
import J3.N1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import java.util.List;
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
import kotlinx.serialization.SerialName;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c.class */
@SerialName("PLAYLIST_BANNER")
@StabilityInferred(parameters = 0)
@Serializable
public final class c implements InterfaceC5118d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71266b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new M1(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yk0.c<List<C0444c>> f71267a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71269b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.filmlistbanner.c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71268a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PLAYLIST_BANNER", (GeneratedSerializer) obj, 1);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            f71269b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{c.f71266b[0].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71269b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c.f71266b;
            int i7 = 1;
            Yk0.c cVar = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                cVar = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        cVar = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), cVar);
                        i7 = 1;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new c(i7, cVar);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71269b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71269b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) c.f71266b[0].getValue(), ((c) obj).f71267a);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<c> serializer() {
            return a.f71268a;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.filmlistbanner.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class C0444c implements InterfaceC7871a, InterfaceC8453a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f71270d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new N1(7))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f71271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f71272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f71273c;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.filmlistbanner.c$c$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<C0444c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f71274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f71275b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.filmlistbanner.c$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f71274a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.filmlistbanner.FilmListHubBanner.Item", (GeneratedSerializer) obj, 3);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f71275b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = C0444c.f71270d;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                Map map;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71275b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = C0444c.f71270d;
                String strDecodeStringElement2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    i7 = 7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    strDecodeStringElement = null;
                    map = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map);
                            i7 |= 4;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new C0444c(i7, strDecodeStringElement2, strDecodeStringElement, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f71275b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                C0444c c0444c = (C0444c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71275b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = C0444c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(c0444c.f71271a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, c0444c.f71271a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(c0444c.f71272b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0444c.f71272b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(c0444c.f71273c, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) C0444c.f71270d[2].getValue(), c0444c.f71273c);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.filmlistbanner.c$c$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/c$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<C0444c> serializer() {
                return a.f71274a;
            }
        }

        public C0444c() {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f71271a = "";
            this.f71272b = "";
            this.f71273c = mapEmptyMap;
        }

        public C0444c(int i7, String str, String str2, Map map) {
            if ((i7 & 1) == 0) {
                this.f71271a = "";
            } else {
                this.f71271a = str;
            }
            if ((i7 & 2) == 0) {
                this.f71272b = "";
            } else {
                this.f71272b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f71273c = MapsKt.emptyMap();
            } else {
                this.f71273c = map;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0444c)) {
                return false;
            }
            C0444c c0444c = (C0444c) obj;
            return Intrinsics.areEqual(this.f71271a, c0444c.f71271a) && Intrinsics.areEqual(this.f71272b, c0444c.f71272b) && Intrinsics.areEqual(this.f71273c, c0444c.f71273c);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String f() {
            return "pgc.{pageName}.plaza.banner.show";
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String getClickEventId() {
            return "pgc.{pageName}.plaza.banner.click";
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f71273c;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f71272b;
        }

        public final int hashCode() {
            return this.f71273c.hashCode() + E.a(this.f71271a.hashCode() * 31, 31, this.f71272b);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f71273c;
            StringBuilder sb = new StringBuilder("Item(cover=");
            sb.append(this.f71271a);
            sb.append(", url=");
            return C4665g.a(sb, this.f71272b, ", report=", map, ")");
        }
    }

    public c(int i7, Yk0.c cVar) {
        if (1 != (i7 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f71269b);
        }
        this.f71267a = cVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f71267a, ((c) obj).f71267a);
    }

    public final int hashCode() {
        return this.f71267a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FilmListHubBanner(module_data=" + this.f71267a + ")";
    }
}
