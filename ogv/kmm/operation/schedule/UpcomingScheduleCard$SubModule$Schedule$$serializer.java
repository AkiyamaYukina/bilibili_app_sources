package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$Schedule$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class UpcomingScheduleCard$SubModule$Schedule$$serializer implements GeneratedSerializer<UpcomingScheduleCard.SubModule.Schedule> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final UpcomingScheduleCard$SubModule$Schedule$$serializer f68739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68740b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$SubModule$Schedule$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68739a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("timeline", (GeneratedSerializer) obj, 5);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("url_text", true);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement("sub_items", true);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new UpcomingScheduleCard$SubModule$Schedule$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type"));
        f68740b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = UpcomingScheduleCard.SubModule.Schedule.h;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, lazyArr[3].getValue(), lazyArr[4].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i7;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Map map;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68740b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = UpcomingScheduleCard.SubModule.Schedule.h;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
            i7 = 31;
            strDecodeStringElement2 = strDecodeStringElement4;
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), (Object) null);
        } else {
            boolean z6 = true;
            i7 = 0;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            map = null;
            list = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i7 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i7 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i7 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map);
                    i7 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list);
                    i7 |= 16;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new UpcomingScheduleCard.SubModule.Schedule(i7, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement2, list, map);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68740b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        UpcomingScheduleCard.SubModule.Schedule schedule = (UpcomingScheduleCard.SubModule.Schedule) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68740b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        UpcomingScheduleCard.SubModule.Schedule.a aVar = UpcomingScheduleCard.SubModule.Schedule.Companion;
        UpcomingScheduleCard.SubModule.a(schedule, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(schedule.f68738g, CollectionsKt.emptyList())) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) UpcomingScheduleCard.SubModule.Schedule.h[4].getValue(), schedule.f68738g);
        }
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
