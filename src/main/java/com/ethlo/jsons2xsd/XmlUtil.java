package com.ethlo.jsons2xsd;

/*-
 * #%L
 * jsons2xsd
 * %%
 * Copyright (C) 2014 - 2020 Morten Haraldsen (ethlo)
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.util.LinkedList;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import com.sun.xml.xsom.parser.XSOMParser;

public class XmlUtil {

    private XmlUtil() {
    }

    public static String asXmlString(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Document newDocument() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static DocumentBuilder getBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Element createXsdElement(Node element, String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateSchema(Document doc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class EH implements ErrorHandler {

        private final List<SAXParseException> warnings = new LinkedList<>();

        private final List<SAXParseException> errors = new LinkedList<>();

        public void error(SAXParseException x) throws SAXException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void fatalError(SAXParseException x) throws SAXException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void warning(SAXParseException x) throws SAXException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public List<SAXParseException> getErrors() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public List<SAXParseException> getWarnings() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
