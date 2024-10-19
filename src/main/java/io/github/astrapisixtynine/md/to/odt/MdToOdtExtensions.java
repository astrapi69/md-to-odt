package io.github.astrapisixtynine.md.to.odt;

import cz.zcu.kiv.md2odt.MD2odt;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

/**
 * Utility class for converting Markdown files to ODT format using the MD2odt library
 */
public class MdToOdtExtensions {

    /**
     * Converts a markdown file to an ODT file
     *
     * @param mdFile the path to the markdown file
     * @param mdFileCharset the charset of the markdown file
     * @param odtFilePath the path where the output ODT file will be written
     * @throws IOException if an I/O error occurs during the conversion
     */
    public static void convert(InputStream mdFile, Charset mdFileCharset, Path odtFilePath) throws IOException {
        MD2odt.converter()
                .setInput(mdFile, mdFileCharset)
                .setOutput(odtFilePath)
                .enableAllExtensions()
                .convert();
    }
}
