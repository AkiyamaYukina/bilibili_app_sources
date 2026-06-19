package com.bilibili.lib.tribe.core.internal.exceptions;

import SW.a;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/exceptions/DeleteDirectoryException.class */
public final class DeleteDirectoryException extends IOException {
    public DeleteDirectoryException(@NotNull File file) {
        super(a.b(file, "Delete dir ", " failed."));
    }
}
