package com.bilibili.ogv.kmm.operation.feedrank;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.feedrank.FeedRank;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
import java.util.Arrays;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/feedrank/FeedRank$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class FeedRank$$serializer implements GeneratedSerializer<FeedRank> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FeedRank$$serializer f68265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68266b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.feedrank.FeedRank$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68265a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.feedrank.FeedRank", (GeneratedSerializer) obj, 5);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("module_data", false);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        final String[] strArr = {"SIMPLE_RANK", "SIMPLE_PLAYLIST"};
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ModuleTypeNames(strArr) { // from class: com.bilibili.ogv.kmm.operation.feedrank.FeedRank$$serializer$annotationImpl$com_bilibili_ogv_operation3_module_concept_ModuleTypeNames$0
            private final String[] names;

            {
                this.names = strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ModuleTypeNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(@Nullable Object obj2) {
                return (obj2 instanceof ModuleTypeNames) && Arrays.equals(names(), ((ModuleTypeNames) obj2).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(this.names) ^ 397397176;
            }

            @Override // com.bilibili.ogv.operation3.module.concept.ModuleTypeNames
            public final /* synthetic */ String[] names() {
                return this.names;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return android.support.v4.media.a.a("@com.bilibili.ogv.operation3.module.concept.ModuleTypeNames(names=", Arrays.toString(this.names), ")");
            }
        });
        f68266b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = FeedRank.f68259f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, FeedRank.b.a.f68274a, lazyArr[3].getValue(), LongSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        long jDecodeLongElement;
        int i7;
        String strDecodeStringElement;
        FeedRank.b bVar;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68266b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = FeedRank.f68259f;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            bVar = (FeedRank.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, FeedRank.b.a.f68274a, (Object) null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
            i7 = 31;
        } else {
            jDecodeLongElement = 0;
            boolean z6 = true;
            i7 = 0;
            strDecodeStringElement = null;
            bVar = null;
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
                } else if (iDecodeElementIndex == 2) {
                    bVar = (FeedRank.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, FeedRank.b.a.f68274a, bVar);
                    i7 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map);
                    i7 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                    i7 |= 16;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new FeedRank(i7, strDecodeStringElement2, strDecodeStringElement, bVar, map, jDecodeLongElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68266b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        FeedRank feedRank = (FeedRank) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68266b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, feedRank.f68260a);
        boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
        String str = feedRank.f68261b;
        if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, FeedRank.b.a.f68274a, feedRank.f68262c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(feedRank.f68263d, MapsKt.emptyMap())) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) FeedRank.f68259f[3].getValue(), feedRank.f68263d);
        }
        compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 4, feedRank.f68264e);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
