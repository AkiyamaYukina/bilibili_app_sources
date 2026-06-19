package com.bilibili.ogv.secondary.api;

import G3.C1933l;
import G3.C1935m;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/a.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f72625c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeedType f72626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Long> f72627b;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0456a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0456a f72628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72629b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.api.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72628a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.api.Feed", (GeneratedSerializer) obj, 2);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("fall_wid", true);
            f72629b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f72625c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            List list;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72629b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f72625c;
            FeedType feedType = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                feedType = (FeedType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                i7 = 3;
            } else {
                boolean z6 = true;
                i7 = 0;
                list = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        feedType = (FeedType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), feedType);
                        i7 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list);
                        i7 |= 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, feedType, list);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72629b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72629b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
            Lazy<KSerializer<Object>>[] lazyArr = a.f72625c;
            if (zShouldEncodeElementDefault || aVar.f72626a != FeedType.PGC_FEED) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), aVar.f72626a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(aVar.f72627b, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), aVar.f72627b);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0456a.f72628a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f72625c = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C1933l(7)), LazyKt.lazy(lazyThreadSafetyMode, new C1935m(8))};
    }

    public a() {
        FeedType feedType = FeedType.PGC_FEED;
        List<Long> listEmptyList = CollectionsKt.emptyList();
        this.f72626a = feedType;
        this.f72627b = listEmptyList;
    }

    public a(int i7, FeedType feedType, List list) {
        this.f72626a = (i7 & 1) == 0 ? FeedType.PGC_FEED : feedType;
        if ((i7 & 2) == 0) {
            this.f72627b = CollectionsKt.emptyList();
        } else {
            this.f72627b = list;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72626a == aVar.f72626a && Intrinsics.areEqual(this.f72627b, aVar.f72627b);
    }

    public final int hashCode() {
        return this.f72627b.hashCode() + (this.f72626a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Feed(type=" + this.f72626a + ", wids=" + this.f72627b + ")";
    }
}
