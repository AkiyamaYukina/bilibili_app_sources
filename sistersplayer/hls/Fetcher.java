package com.bilibili.sistersplayer.hls;

import F3.U0;
import Tq.j;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.snapshots.z;
import cf.e;
import com.bilibili.sistersplayer.p2p.P2PConfig;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.tencent.connect.common.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher.class */
public final class Fetcher {

    @NotNull
    public static final String TAG = "Fetcher";

    @Nullable
    private final P2PConfig config;

    @Nullable
    private final FetcherCall extFetcherCall;

    @NotNull
    private final ConcurrentLinkedDeque<FetchStats> fetchHistory;

    @NotNull
    private final P2PLogger logger;
    private int maxHistorySize;

    @NotNull
    private final Lazy okHttpClientInstance$delegate;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy<OkHttpClient> okHttpClient$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new U0(11));

    @NotNull
    private static String currentHttpProtocol = "unknown-init";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getCurrentHttpProtocol() {
            return Fetcher.currentHttpProtocol;
        }

        @NotNull
        public final String getEngineType() {
            return "OKHTTP";
        }

        @NotNull
        public final OkHttpClient getOkHttpClient() {
            return (OkHttpClient) Fetcher.okHttpClient$delegate.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$FetcherCall.class */
    public interface FetcherCall {
        void cancel();

        @NotNull
        Response request(@NotNull String str, long j7, @NotNull HashMap<String, String> map);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$OKHttpCall.class */
    public static final class OKHttpCall implements FetcherCall {

        @NotNull
        private final OkHttpClient client;

        @Nullable
        private Call innerCall;

        @NotNull
        private final P2PLogger logger;

        public OKHttpCall(@NotNull OkHttpClient okHttpClient, @NotNull P2PLogger p2PLogger) {
            this.client = okHttpClient;
            this.logger = p2PLogger;
        }

        @Override // com.bilibili.sistersplayer.hls.Fetcher.FetcherCall
        public void cancel() {
            Call call = this.innerCall;
            if (call != null) {
                call.cancel();
            }
        }

        @Nullable
        public final Call getInnerCall() {
            return this.innerCall;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
        @Override // com.bilibili.sistersplayer.hls.Fetcher.FetcherCall
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.bilibili.sistersplayer.hls.Fetcher.Response request(@org.jetbrains.annotations.NotNull java.lang.String r9, long r10, @org.jetbrains.annotations.NotNull java.util.HashMap<java.lang.String, java.lang.String> r12) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.OKHttpCall.request(java.lang.String, long, java.util.HashMap):com.bilibili.sistersplayer.hls.Fetcher$Response");
        }

        public final void setInnerCall(@Nullable Call call) {
            this.innerCall = call;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$Response.class */
    public static final class Response implements Closeable {

        @Nullable
        private final InputStream byteStream;
        private final int code;
        private final boolean isSuccessful;

        @Nullable
        private final String message;

        public Response(boolean z6, int i7, @Nullable String str, @Nullable InputStream inputStream) {
            this.isSuccessful = z6;
            this.code = i7;
            this.message = str;
            this.byteStream = inputStream;
        }

        public static /* synthetic */ Response copy$default(Response response, boolean z6, int i7, String str, InputStream inputStream, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z6 = response.isSuccessful;
            }
            if ((i8 & 2) != 0) {
                i7 = response.code;
            }
            if ((i8 & 4) != 0) {
                str = response.message;
            }
            if ((i8 & 8) != 0) {
                inputStream = response.byteStream;
            }
            return response.copy(z6, i7, str, inputStream);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.byteStream;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public final boolean component1() {
            return this.isSuccessful;
        }

        public final int component2() {
            return this.code;
        }

        @Nullable
        public final String component3() {
            return this.message;
        }

        @Nullable
        public final InputStream component4() {
            return this.byteStream;
        }

        @NotNull
        public final Response copy(boolean z6, int i7, @Nullable String str, @Nullable InputStream inputStream) {
            return new Response(z6, i7, str, inputStream);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return this.isSuccessful == response.isSuccessful && this.code == response.code && Intrinsics.areEqual(this.message, response.message) && Intrinsics.areEqual(this.byteStream, response.byteStream);
        }

        @Nullable
        public final InputStream getByteStream() {
            return this.byteStream;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iA = I.a(this.code, Boolean.hashCode(this.isSuccessful) * 31, 31);
            String str = this.message;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            InputStream inputStream = this.byteStream;
            if (inputStream != null) {
                iHashCode = inputStream.hashCode();
            }
            return ((iA + iHashCode2) * 31) + iHashCode;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        @NotNull
        public String toString() {
            boolean z6 = this.isSuccessful;
            int i7 = this.code;
            String str = this.message;
            InputStream inputStream = this.byteStream;
            StringBuilder sbA = e.a(i7, "Response(isSuccessful=", ", code=", ", message=", z6);
            sbA.append(str);
            sbA.append(", byteStream=");
            sbA.append(inputStream);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$UrlCall.class */
    public static final class UrlCall implements FetcherCall {

        @Nullable
        private HttpURLConnection connection;

        @Override // com.bilibili.sistersplayer.hls.Fetcher.FetcherCall
        public void cancel() {
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        @Nullable
        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        @Override // com.bilibili.sistersplayer.hls.Fetcher.FetcherCall
        @NotNull
        public Response request(@NotNull String str, long j7, @NotNull HashMap<String, String> map) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.connection = httpURLConnection;
            if (httpURLConnection != null) {
                httpURLConnection.setConnectTimeout(5000);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                HttpURLConnection httpURLConnection2 = this.connection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            HttpURLConnection httpURLConnection3 = this.connection;
            if (httpURLConnection3 != null) {
                httpURLConnection3.setRequestMethod(Constants.HTTP_GET);
            }
            HttpURLConnection httpURLConnection4 = this.connection;
            if (httpURLConnection4 != null) {
                httpURLConnection4.connect();
            }
            IntRange intRange = new IntRange(200, 299);
            HttpURLConnection httpURLConnection5 = this.connection;
            Integer numValueOf = httpURLConnection5 != null ? Integer.valueOf(httpURLConnection5.getResponseCode()) : null;
            boolean z6 = numValueOf != null && intRange.contains(numValueOf.intValue());
            HttpURLConnection httpURLConnection6 = this.connection;
            int responseCode = httpURLConnection6 != null ? httpURLConnection6.getResponseCode() : -1;
            HttpURLConnection httpURLConnection7 = this.connection;
            String responseMessage = httpURLConnection7 != null ? httpURLConnection7.getResponseMessage() : null;
            HttpURLConnection httpURLConnection8 = this.connection;
            return new Response(z6, responseCode, responseMessage, httpURLConnection8 != null ? httpURLConnection8.getInputStream() : null);
        }

        public final void setConnection(@Nullable HttpURLConnection httpURLConnection) {
            this.connection = httpURLConnection;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public Fetcher(@Nullable FetcherCall fetcherCall, @Nullable P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.extFetcherCall = fetcherCall;
        this.config = p2PConfig;
        this.logger = p2PLogger;
        this.maxHistorySize = 5;
        this.fetchHistory = new ConcurrentLinkedDeque<>();
        this.okHttpClientInstance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new j(this, 5));
    }

    public /* synthetic */ Fetcher(FetcherCall fetcherCall, P2PConfig p2PConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fetcherCall, (i7 & 2) != 0 ? null : p2PConfig, p2PLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024f A[Catch: all -> 0x021e, Exception -> 0x0223, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0223, blocks: (B:54:0x01ed, B:56:0x01ff, B:68:0x024f, B:71:0x02b5, B:69:0x0299, B:62:0x0228, B:64:0x0233), top: B:160:0x01ed, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0299 A[Catch: all -> 0x021e, Exception -> 0x0223, TRY_ENTER, TryCatch #3 {Exception -> 0x0223, blocks: (B:54:0x01ed, B:56:0x01ff, B:68:0x024f, B:71:0x02b5, B:69:0x0299, B:62:0x0228, B:64:0x0233), top: B:160:0x01ed, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e9 A[Catch: all -> 0x0336, TRY_ENTER, TryCatch #1 {all -> 0x0336, blocks: (B:50:0x01d7, B:76:0x0316, B:76:0x0316, B:75:0x02e9), top: B:156:0x01d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object fetch$default(com.bilibili.sistersplayer.hls.Fetcher r13, java.lang.String r14, long r15, int r17, java.lang.Integer r18, java.lang.Integer r19, kotlin.jvm.functions.Function0 r20, kotlin.coroutines.Continuation r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetch$default(com.bilibili.sistersplayer.hls.Fetcher, java.lang.String, long, int, java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        r14 = new com.bilibili.sistersplayer.hls.FetchResult(false, r0.getCode() + ": " + r0.getMessage() + " -> invokeOnCancellation", r0.getCode(), null, null, false, null, 120, null);
        r0.close();
        r0.getByteStream().close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01da, code lost:
    
        r0.close();
        r0.getByteStream().close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01eb, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object fetchByStream$$forInline(kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Boolean, kotlin.Unit> r14, java.lang.String r15, int r16, int r17, long r18, kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.hls.FetchResult<byte[]>> r20) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchByStream$$forInline(kotlin.jvm.functions.Function2, java.lang.String, int, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object fetchByStream$default(com.bilibili.sistersplayer.hls.Fetcher r13, kotlin.jvm.functions.Function2 r14, java.lang.String r15, int r16, int r17, long r18, kotlin.coroutines.Continuation r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchByStream$default(com.bilibili.sistersplayer.hls.Fetcher, kotlin.jvm.functions.Function2, java.lang.String, int, int, long, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(3:184|33|34)|(16:35|(3:198|37|38)(1:43)|44|(4:46|200|47|(5:48|49|50|51|(7:202|53|54|196|55|56|57)))(1:210)|65|98|190|99|100|101|102|103|104|105|106|211)|76|77|78|79|80|81|82|83|84|85|86|87|88|194|89|104|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0088, code lost:
    
        r41 = r40;
        r31 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0401, code lost:
    
        r40 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05ac A[LOOP:0: B:6:0x0079->B:142:0x05ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05be A[EDGE_INSN: B:209:0x05be->B:143:0x05be BREAK  A[LOOP:0: B:6:0x0079->B:142:0x05ac], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object fetchPartByBlock$$forInline(kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> r14, java.lang.String r15, int r16, int r17, int r18, int r19, long r20, kotlin.jvm.functions.Function0<java.lang.Boolean> r22, kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.hls.FetchResult<byte[]>> r23) {
        /*
            Method dump skipped, instruction units count: 1843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchPartByBlock$$forInline(kotlin.jvm.functions.Function3, java.lang.String, int, int, int, int, long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0691 A[LOOP:0: B:25:0x00c5->B:156:0x0691, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0697 A[EDGE_INSN: B:221:0x0697->B:157:0x0697 BREAK  A[LOOP:0: B:25:0x00c5->B:156:0x0691], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object fetchPartByBlock$default(com.bilibili.sistersplayer.hls.Fetcher r13, kotlin.jvm.functions.Function3 r14, java.lang.String r15, int r16, int r17, int r18, int r19, long r20, kotlin.jvm.functions.Function0 r22, kotlin.coroutines.Continuation r23, int r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchPartByBlock$default(com.bilibili.sistersplayer.hls.Fetcher, kotlin.jvm.functions.Function3, java.lang.String, int, int, int, int, long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object");
    }

    @PublishedApi
    public static /* synthetic */ void getLogger$annotations() {
    }

    private final OkHttpClient getOkHttpClientInstance() {
        return (OkHttpClient) this.okHttpClientInstance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient okHttpClientInstance_delegate$lambda$0(Fetcher fetcher) {
        OkHttpClient okHttpClient;
        P2PConfig p2PConfig = fetcher.config;
        P2PConfig.FetchTimeOut fetchTimeOut = p2PConfig != null ? p2PConfig.getFetchTimeOut() : null;
        if (fetchTimeOut == null || !fetchTimeOut.getEnable()) {
            okHttpClient = Companion.getOkHttpClient();
        } else {
            P2PLogger p2PLogger = fetcher.logger;
            long callTimeout = fetchTimeOut.getCallTimeout();
            long readTimeOut = fetchTimeOut.getReadTimeOut();
            long writeTimeOut = fetchTimeOut.getWriteTimeOut();
            long connectTimeOut = fetchTimeOut.getConnectTimeOut();
            StringBuilder sbA = z.a(callTimeout, "Using custom timeout config: call=", "ms, read=");
            sbA.append(readTimeOut);
            J1.z.a(writeTimeOut, "ms, write=", "ms, connect=", sbA);
            P2PLogger.logI$default(p2PLogger, TAG, android.support.v4.media.session.a.a(sbA, connectTimeOut, "ms"), null, 4, null);
            OkHttpClient.Builder builderNewBuilder = Companion.getOkHttpClient().newBuilder();
            long readTimeOut2 = fetchTimeOut.getReadTimeOut();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            okHttpClient = builderNewBuilder.readTimeout(readTimeOut2, timeUnit).writeTimeout(fetchTimeOut.getWriteTimeOut(), timeUnit).connectTimeout(fetchTimeOut.getConnectTimeOut(), timeUnit).retryOnConnectionFailure(true).addNetworkInterceptor(new OkHttpLogInterceptor(fetcher.logger)).build();
        }
        return okHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient okHttpClient_delegate$lambda$7() {
        return new OkHttpClient.Builder().retryOnConnectionFailure(true).build();
    }

    public final void addFetchHistory(@NotNull FetchStats fetchStats) {
        this.fetchHistory.add(fetchStats);
        while (this.fetchHistory.size() > this.maxHistorySize && !this.fetchHistory.isEmpty()) {
            this.fetchHistory.removeFirst();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x031f A[EDGE_INSN: B:150:0x031f->B:78:0x031f BREAK  A[LOOP:0: B:6:0x0070->B:77:0x0319], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ef A[Catch: all -> 0x01be, Exception -> 0x01c3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01be, blocks: (B:34:0x017b, B:36:0x0181, B:38:0x018d, B:40:0x019f, B:52:0x01ef, B:55:0x0255, B:57:0x0281, B:60:0x02b6, B:53:0x0239, B:46:0x01c8, B:48:0x01d3, B:56:0x025d, B:59:0x0289), top: B:143:0x017b, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0239 A[Catch: all -> 0x01be, Exception -> 0x01c3, TRY_ENTER, TryCatch #4 {all -> 0x01be, blocks: (B:34:0x017b, B:36:0x0181, B:38:0x018d, B:40:0x019f, B:52:0x01ef, B:55:0x0255, B:57:0x0281, B:60:0x02b6, B:53:0x0239, B:46:0x01c8, B:48:0x01d3, B:56:0x025d, B:59:0x0289), top: B:143:0x017b, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0289 A[Catch: all -> 0x01be, TRY_ENTER, TryCatch #4 {all -> 0x01be, blocks: (B:34:0x017b, B:36:0x0181, B:38:0x018d, B:40:0x019f, B:52:0x01ef, B:55:0x0255, B:57:0x0281, B:60:0x02b6, B:53:0x0239, B:46:0x01c8, B:48:0x01d3, B:56:0x025d, B:59:0x0289), top: B:143:0x017b, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0319 A[LOOP:0: B:6:0x0070->B:77:0x0319, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ <T> java.lang.Object fetch(java.lang.String r14, long r15, int r17, java.lang.Integer r18, java.lang.Integer r19, kotlin.jvm.functions.Function0<java.lang.Boolean> r20, kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.hls.FetchResult<T>> r21) {
        /*
            Method dump skipped, instruction units count: 1341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetch(java.lang.String, long, int, java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.io.Closeable] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchByStream(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Boolean, kotlin.Unit> r14, @org.jetbrains.annotations.NotNull java.lang.String r15, int r16, int r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.hls.FetchResult<byte[]>> r20) {
        /*
            Method dump skipped, instruction units count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchByStream(kotlin.jvm.functions.Function2, java.lang.String, int, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x048b A[LOOP:0: B:6:0x0063->B:130:0x048b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b0  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchPartByBlock(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> r14, @org.jetbrains.annotations.NotNull java.lang.String r15, int r16, int r17, int r18, int r19, long r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<java.lang.Boolean> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.hls.FetchResult<byte[]>> r23) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Fetcher.fetchPartByBlock(kotlin.jvm.functions.Function3, java.lang.String, int, int, int, int, long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FetcherCall getCall() {
        FetcherCall fetcherCall = this.extFetcherCall;
        FetcherCall oKHttpCall = fetcherCall;
        if (fetcherCall == null) {
            oKHttpCall = new OKHttpCall(getOkHttpClientInstance(), this.logger);
        }
        return oKHttpCall;
    }

    @NotNull
    public final ConcurrentLinkedDeque<FetchStats> getFetchHistory() {
        return this.fetchHistory;
    }

    @NotNull
    public final P2PLogger getLogger() {
        return this.logger;
    }

    public final void setMaxHistorySize(int i7) {
        this.maxHistorySize = i7;
    }
}
