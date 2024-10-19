package io.github.astrapisixtynine.md.to.odt;

import cz.zcu.kiv.md2odt.MD2odt;
import io.github.astrapi69.file.search.PathFinder;
import io.github.astrapi69.io.StreamExtensions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test class for {@link MdToOdtExtensions}
 */
class MdToOdtExtensionsTest {

    /**
     * Test to verify that {@link MdToOdtExtensions#convert(Path, Charset, Path)} runs without throwing exceptions
     * with valid input parameters
     *
     * @throws IOException if an I/O error occurs during file creation
     */
    @Test
    void testConvertValidInput() throws IOException {
        File file = PathFinder.getRelativePath(PathFinder.getSrcTestResourcesDir(), "example.md");
        Path mdFilePath = file.toPath();
        Path odtFilePath = Files.createTempFile("test-odt", ".odt");

        MD2odt.converter()
                .setInput(mdFilePath, StandardCharsets.UTF_8)
                .setOutput(odtFilePath)
//                .enableAllExtensions()
                .convert();
    }
//
//    /**
//     * Test to verify that {@link MdToOdtExtensions#convert(Path, Charset, Path)} throws IOException
//     * when the input markdown file does not exist
//     */
//    @Test
//    void testConvertInvalidInput() {
//        Path invalidMdFilePath = Paths.get("invalid.md");
//        Path odtFilePath = Paths.get("invalid.odt");
//
//        assertThrows(IOException.class, () -> MdToOdtExtensions.convert(invalidMdFilePath, Charset.defaultCharset(), odtFilePath));
//    }
//
//    /**
//     * Parameterized test for {@link MdToOdtExtensions#convert(Path, Charset, Path)} using a CSV file
//     * The CSV file should provide valid markdown file paths, charsets, and output ODT paths
//     *
//     * @param mdFilePath the markdown file path
//     * @param mdFileCharset the charset of the markdown file
//     * @param odtFilePath the output ODT file path
//     */
//    @ParameterizedTest
//    @CsvFileSource(resources = "/md_to_odt_test_data.csv", numLinesToSkip = 1)
//    void testConvertWithCsv(Path mdFilePath, Charset mdFileCharset, Path odtFilePath) {
//        assertDoesNotThrow(() -> MdToOdtExtensions.convert(mdFilePath, mdFileCharset, odtFilePath));
//    }
}
