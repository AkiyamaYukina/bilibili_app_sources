package com.bilibili.lib.projection.internal.nirvana;

import M3.C2584h0;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.nirvana.process_interface.DmrProcessResponse;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/CommonNvaController.class */
public final class CommonNvaController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f63217a = LazyKt.lazy(new C2584h0(10));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f63218b = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/CommonNvaController$DMRProcess.class */
    public static final class DMRProcess {
        private static final EnumEntries $ENTRIES;
        private static final DMRProcess[] $VALUES;
        private final int rawValue;
        public static final DMRProcess MSearchSent = new DMRProcess("MSearchSent", 0, 1);
        public static final DMRProcess SSDPSearchResponse = new DMRProcess("SSDPSearchResponse", 1, 2);
        public static final DMRProcess DescriptionFetchStart = new DMRProcess("DescriptionFetchStart", 2, 3);
        public static final DMRProcess DescriptionFetchParse = new DMRProcess("DescriptionFetchParse", 3, 4);
        public static final DMRProcess SCPDFetched = new DMRProcess("SCPDFetched", 4, 5);
        public static final DMRProcess DeviceAdd = new DMRProcess("DeviceAdd", 5, 6);
        public static final DMRProcess DeviceRemove = new DMRProcess("DeviceRemove", 6, 8);

        private static final /* synthetic */ DMRProcess[] $values() {
            return new DMRProcess[]{MSearchSent, SSDPSearchResponse, DescriptionFetchStart, DescriptionFetchParse, SCPDFetched, DeviceAdd, DeviceRemove};
        }

        static {
            DMRProcess[] dMRProcessArr$values = $values();
            $VALUES = dMRProcessArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dMRProcessArr$values);
        }

        private DMRProcess(String str, int i7, int i8) {
            this.rawValue = i8;
        }

        @NotNull
        public static EnumEntries<DMRProcess> getEntries() {
            return $ENTRIES;
        }

        public static DMRProcess valueOf(String str) {
            return (DMRProcess) Enum.valueOf(DMRProcess.class, str);
        }

        public static DMRProcess[] values() {
            return (DMRProcess[]) $VALUES.clone();
        }

        public final int getRawValue() {
            return this.rawValue;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/CommonNvaController$a.class */
    public static final class a implements DmrProcessResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CopyOnWriteArraySet<String> f63219a = new CopyOnWriteArraySet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CopyOnWriteArraySet<String> f63220b = new CopyOnWriteArraySet<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArraySet<String> f63221c = new CopyOnWriteArraySet<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CopyOnWriteArraySet<String> f63222d = new CopyOnWriteArraySet<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CopyOnWriteArraySet<String> f63223e = new CopyOnWriteArraySet<>();

        public final void a(String str, int i7, long j7, String str2, boolean z6, String str3) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63221c.contains(strA)) {
                return;
            }
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.DescriptionFetchParse.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to("success", String.valueOf(z6)), TuplesKt.to("error_code", String.valueOf(i7)), TuplesKt.to("friendly_name", str2), TuplesKt.to("device_type", str3)}), 0, (Function0) null, 24, (Object) null);
            this.f63221c.add(strA);
        }

        public final void b(long j7, boolean z6, int i7, String str, String str2) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63222d.contains(strA)) {
                return;
            }
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.SCPDFetched.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to("success", String.valueOf(z6)), TuplesKt.to("error_code", String.valueOf(i7)), TuplesKt.to("service_id", str2)}), 0, (Function0) null, 24, (Object) null);
            this.f63222d.add(strA);
        }

        public final void c(long j7, boolean z6, int i7, String str, String str2) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63219a.contains(strA)) {
                return;
            }
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.SSDPSearchResponse.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to("description_url_location", str2), TuplesKt.to("success", String.valueOf(z6)), TuplesKt.to("error_code", String.valueOf(i7))}), 0, (Function0) null, 24, (Object) null);
            this.f63219a.add(strA);
        }

        public final void d(long j7, String str, String str2) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63220b.contains(strA)) {
                return;
            }
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.DescriptionFetchStart.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to("description_url_location", str2)}), 0, (Function0) null, 24, (Object) null);
            this.f63220b.add(strA);
        }

        public final void e(int i7, long j7, String str) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63223e.contains(strA)) {
                Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.DeviceRemove.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to(Constant.IN_KEY_REASON, String.valueOf(i7))}), 0, (Function0) null, 24, (Object) null);
                this.f63223e.remove(strA);
            }
        }

        public final void f(long j7, String str, String str2, String str3) {
            String strA = i5.d.a(j7, str, "_");
            if (this.f63223e.contains(strA)) {
                return;
            }
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.DeviceAdd.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("uuid", str), TuplesKt.to("friendly_name", str2), TuplesKt.to("device_type", str3)}), 0, (Function0) null, 24, (Object) null);
            this.f63223e.add(strA);
        }

        public final void g(long j7, String str) {
            Neurons.trackT$default(false, "cast.dmrprocess.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("process_status", String.valueOf(DMRProcess.MSearchSent.getRawValue())), TuplesKt.to("search_session_id", String.valueOf(j7)), TuplesKt.to("search_target", str)}), 0, (Function0) null, 24, (Object) null);
            this.f63219a.clear();
            this.f63220b.clear();
            this.f63221c.clear();
            this.f63222d.clear();
            this.f63223e.clear();
        }
    }
}
