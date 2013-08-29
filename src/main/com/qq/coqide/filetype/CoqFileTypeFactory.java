package com.qq.coqide.filetype;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * User: enrique
 * Created: 8/14/13 10:52 PM
 */
public class CoqFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CoqFileType.INSTANCE, "coq");
    }
}
