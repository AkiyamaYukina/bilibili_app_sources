package com.bilibili.ogv.kmm.operation.following;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.following.BangumiFollowing;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class BangumiFollowing$$serializer implements GeneratedSerializer<BangumiFollowing> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BangumiFollowing$$serializer f68302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68303b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.following.BangumiFollowing$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68302a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.following.BangumiFollowing", (GeneratedSerializer) obj, 5);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("module_data", false);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        final String[] strArr = {"FOLLOW_C_V2"};
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ModuleTypeNames(strArr) { // from class: com.bilibili.ogv.kmm.operation.following.BangumiFollowing$$serializer$annotationImpl$com_bilibili_ogv_operation3_module_concept_ModuleTypeNames$0
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
        f68303b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = BangumiFollowing.f68296f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BangumiFollowing.c.a.f68317a, lazyArr[2].getValue(), stringSerializer, LongSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        long jDecodeLongElement;
        int i7;
        BangumiFollowing.c cVar;
        String strDecodeStringElement;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68303b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = BangumiFollowing.f68296f;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            cVar = (BangumiFollowing.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, BangumiFollowing.c.a.f68317a, (Object) null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
            i7 = 31;
        } else {
            jDecodeLongElement = 0;
            boolean z6 = true;
            i7 = 0;
            cVar = null;
            Map map2 = null;
            String strDecodeStringElement3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i7 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    cVar = (BangumiFollowing.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, BangumiFollowing.c.a.f68317a, cVar);
                    i7 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                    i7 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    i7 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                    i7 |= 16;
                }
            }
            Map map3 = map2;
            strDecodeStringElement = strDecodeStringElement3;
            map = map3;
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new BangumiFollowing(i7, strDecodeStringElement2, cVar, map, strDecodeStringElement, jDecodeLongElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68303b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        BangumiFollowing bangumiFollowing = (BangumiFollowing) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68303b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bangumiFollowing.f68297a);
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, BangumiFollowing.c.a.f68317a, bangumiFollowing.f68298b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(bangumiFollowing.f68299c, MapsKt.emptyMap())) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) BangumiFollowing.f68296f[2].getValue(), bangumiFollowing.f68299c);
        }
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, bangumiFollowing.f68300d);
        compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 4, bangumiFollowing.f68301e);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
