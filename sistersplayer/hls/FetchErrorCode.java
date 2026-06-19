package com.bilibili.sistersplayer.hls;

import com.bilibili.biligame.api.BiligameApiResponse;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/FetchErrorCode.class */
public final class FetchErrorCode {
    private static final EnumEntries $ENTRIES;
    private static final FetchErrorCode[] $VALUES;
    private final int ec;
    public static final FetchErrorCode ERROR_NETWORK_FETCH = new FetchErrorCode("ERROR_NETWORK_FETCH", 0, 11001);
    public static final FetchErrorCode ERROR_NETWORK_READ = new FetchErrorCode("ERROR_NETWORK_READ", 1, 11002);
    public static final FetchErrorCode ERROR_PROXY_IO = new FetchErrorCode("ERROR_PROXY_IO", 2, 11003);
    public static final FetchErrorCode ERROR_PLAY_LIST = new FetchErrorCode("ERROR_PLAY_LIST", 3, 11010);
    public static final FetchErrorCode ERROR_M3U8_NOT_UPDATE = new FetchErrorCode("ERROR_M3U8_NOT_UPDATE", 4, 11013);
    public static final FetchErrorCode ERROR_TRACKER_URL = new FetchErrorCode("ERROR_TRACKER_URL", 5, 12000);
    public static final FetchErrorCode ERROR_M3U8_URL_NULL = new FetchErrorCode("ERROR_M3U8_URL_NULL", 6, 12001);
    public static final FetchErrorCode ERROR_BACKUP_SWITCH_NO_MATCH = new FetchErrorCode("ERROR_BACKUP_SWITCH_NO_MATCH", 7, 12002);
    public static final FetchErrorCode ERROR_BACKUP_SWITCH_EXCEPTION = new FetchErrorCode("ERROR_BACKUP_SWITCH_EXCEPTION", 8, 12003);
    public static final FetchErrorCode ERROR_BACKUP_SWITCH_NO_BACKUP = new FetchErrorCode("ERROR_BACKUP_SWITCH_NO_BACKUP", 9, 12004);
    public static final FetchErrorCode ERROR_IO_CANCELED = new FetchErrorCode("ERROR_IO_CANCELED", 10, 22001);
    public static final FetchErrorCode ERROR_IO_TIMEOUT = new FetchErrorCode("ERROR_IO_TIMEOUT", 11, BiligameApiResponse.CODE_BLOCKED);
    public static final FetchErrorCode ERROR_PROTOCOL = new FetchErrorCode("ERROR_PROTOCOL", 12, BiligameApiResponse.CODE_BLOCK);

    @Deprecated(message = "禁止使用模糊定义")
    public static final FetchErrorCode ERROR_UNKNOWN = new FetchErrorCode("ERROR_UNKNOWN", 13, 22004);
    public static final FetchErrorCode ERROR_FETCH_HTTP_ERROR = new FetchErrorCode("ERROR_FETCH_HTTP_ERROR", 14, 220041);
    public static final FetchErrorCode ERROR_FETCH_M3U8_ERROR = new FetchErrorCode("ERROR_FETCH_M3U8_ERROR", 15, 220042);
    public static final FetchErrorCode ERROR_FETCH_M3U8_NO_CONTENT = new FetchErrorCode("ERROR_FETCH_M3U8_NO_CONTENT", 16, 220043);
    public static final FetchErrorCode ERROR_FETCH_M4S_ERROR = new FetchErrorCode("ERROR_FETCH_M4S_ERROR", 17, 220044);
    public static final FetchErrorCode ERROR_CDN_SOCKET_CLOSED = new FetchErrorCode("ERROR_CDN_SOCKET_CLOSED", 18, 22005);
    public static final FetchErrorCode ERROR_CDN_SOCKET_ERROR = new FetchErrorCode("ERROR_CDN_SOCKET_ERROR", 19, 220051);
    public static final FetchErrorCode ERROR_PROXY_SOCKET_CLOSED = new FetchErrorCode("ERROR_PROXY_SOCKET_CLOSED", 20, 22006);
    public static final FetchErrorCode ERROR_UNKNOWN_HOST = new FetchErrorCode("ERROR_UNKNOWN_HOST", 21, 22007);
    public static final FetchErrorCode ERROR_CONNECT_FAIL = new FetchErrorCode("ERROR_CONNECT_FAIL", 22, 22009);
    public static final FetchErrorCode NORMAL_PUSH_END = new FetchErrorCode("NORMAL_PUSH_END", 23, 30000);

    private static final /* synthetic */ FetchErrorCode[] $values() {
        return new FetchErrorCode[]{ERROR_NETWORK_FETCH, ERROR_NETWORK_READ, ERROR_PROXY_IO, ERROR_PLAY_LIST, ERROR_M3U8_NOT_UPDATE, ERROR_TRACKER_URL, ERROR_M3U8_URL_NULL, ERROR_BACKUP_SWITCH_NO_MATCH, ERROR_BACKUP_SWITCH_EXCEPTION, ERROR_BACKUP_SWITCH_NO_BACKUP, ERROR_IO_CANCELED, ERROR_IO_TIMEOUT, ERROR_PROTOCOL, ERROR_UNKNOWN, ERROR_FETCH_HTTP_ERROR, ERROR_FETCH_M3U8_ERROR, ERROR_FETCH_M3U8_NO_CONTENT, ERROR_FETCH_M4S_ERROR, ERROR_CDN_SOCKET_CLOSED, ERROR_CDN_SOCKET_ERROR, ERROR_PROXY_SOCKET_CLOSED, ERROR_UNKNOWN_HOST, ERROR_CONNECT_FAIL, NORMAL_PUSH_END};
    }

    static {
        FetchErrorCode[] fetchErrorCodeArr$values = $values();
        $VALUES = fetchErrorCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fetchErrorCodeArr$values);
    }

    private FetchErrorCode(String str, int i7, int i8) {
        this.ec = i8;
    }

    @NotNull
    public static EnumEntries<FetchErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static FetchErrorCode valueOf(String str) {
        return (FetchErrorCode) Enum.valueOf(FetchErrorCode.class, str);
    }

    public static FetchErrorCode[] values() {
        return (FetchErrorCode[]) $VALUES.clone();
    }

    public final int getEc() {
        return this.ec;
    }
}
