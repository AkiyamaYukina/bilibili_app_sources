package com.bilibili.mall.kmm.common;

import androidx.appcompat.widget.C3259x;
import com.bilibili.mall.kmm.common.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/e.class */
public final class e<T> implements KSerializer<c<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<T> f65593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f65594b;

    public e(@NotNull KSerializer<T> kSerializer) {
        this.f65593a = kSerializer;
        this.f65594b = SerialDescriptorsKt.buildClassSerialDescriptor(Reflection.getOrCreateKotlinClass(c.class).getQualifiedName(), new SerialDescriptor[]{kSerializer.getDescriptor()}, new Function1(this) { // from class: com.bilibili.mall.kmm.common.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f65592a;

            {
                this.f65592a = this;
            }

            public final Object invoke(Object obj) {
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.element("code", IntSerializer.INSTANCE.getDescriptor(), CollectionsKt.emptyList(), false);
                classSerialDescriptorBuilder.element("message", BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE).getDescriptor(), CollectionsKt.emptyList(), false);
                ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "data", this.f65592a.f65593a.getDescriptor(), (List) null, false, 12, (Object) null);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(Decoder decoder) throws SerializationException {
        SerialDescriptor serialDescriptor = this.f65594b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Object objDecodeSerializableElement$default = null;
        String str = null;
        int iDecodeIntElement = 0;
        while (true) {
            int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
            if (iDecodeElementIndex == -1) {
                Object aVar = iDecodeIntElement != 0 ? iDecodeIntElement != 90001001 ? new c.a(iDecodeIntElement, str) : new c.C0367c(objDecodeSerializableElement$default) : (serialDescriptor.isNullable() || objDecodeSerializableElement$default != null) ? new c.C0367c(objDecodeSerializableElement$default) : new c.a(-1, "Null result!");
                compositeDecoderBeginStructure.endStructure(serialDescriptor);
                return aVar;
            }
            if (iDecodeElementIndex == 0) {
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            } else if (iDecodeElementIndex == 1) {
                str = (String) CompositeDecoder.DefaultImpls.decodeNullableSerializableElement$default(compositeDecoderBeginStructure, this.f65594b, 1, BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), (Object) null, 8, (Object) null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new SerializationException(C3259x.a(iDecodeElementIndex, "Unexpected index: "));
                }
                objDecodeSerializableElement$default = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoderBeginStructure, this.f65594b, 2, this.f65593a, (Object) null, 8, (Object) null);
            }
        }
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f65594b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void serialize(Encoder encoder, Object obj) throws NoWhenBranchMatchedException {
        c cVar = (c) obj;
        SerialDescriptor serialDescriptor = this.f65594b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (cVar instanceof c.C0367c) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, 0);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, this.f65593a, ((c.C0367c) cVar).f65591a);
        } else {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c.a aVar = (c.a) cVar;
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, aVar.f65589a);
            String str = aVar.f65590b;
            if (str != null) {
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
            }
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
