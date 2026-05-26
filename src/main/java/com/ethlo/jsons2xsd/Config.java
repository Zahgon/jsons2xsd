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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Config {

    private final String targetNamespace;

    private final String nsAlias;

    private final boolean createRootElement;

    private final String name;

    private final boolean attributesQualified;

    private final boolean includeOnlyUsedTypes;

    private final boolean validateXsdSchema;

    private final Map<String, String> typeMapping;

    private final boolean ignoreUnknownFormats;

    private final String rootElement;

    private final Function<String, String> itemNameMapper;

    private final boolean unwrapArrays;

    public boolean isAttributesQualified() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIncludeOnlyUsedTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetNamespace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNsAlias() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isCreateRootElement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isValidateXsdSchema() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getTypeMapping() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIgnoreUnknownFormats() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRootElement() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Function<String, String> getItemNameMapper() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isUnwrapArrays() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getType(String type, String format) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private String name;

        private String targetNamespace;

        private String nsAlias = "x";

        private boolean createRootElement = false;

        private boolean attributesQualified = false;

        private boolean includeOnlyUsedTypes = false;

        private boolean validateXsdSchema = true;

        private final Map<String, String> typeMapping = new HashMap<>();

        private boolean ignoreUnknownFormats;

        private String rootElement;

        private Function<String, String> itemNameMapper = Function.identity();

        private boolean unwrapArrays = false;

        public Builder targetNamespace(String targetNamespace) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder nsAlias(String nsAlias) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder createRootElement(boolean b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder includeOnlyUsedTypes(boolean b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Config build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder name(String name) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder attributesQualified(boolean b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder validateXsdSchema(boolean b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder customTypeMapping(final JsonSimpleType jsonSimpleType, final String format, final XsdSimpleType xsdSimpleType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder nonJsonTypeMapping(final String nonJsonType, final XsdSimpleType xsdSimpleType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder nonJsonTypeMapping(final String nonJsonType, final String format, final XsdSimpleType xsdSimpleType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder ignoreUnknownFormats(final boolean b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder rootElement(final String name) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder mapArrayItemNames(final Function<String, String> mapper) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder unwrapArrays(final boolean unwrapArrays) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private Config(Builder builder) {
        this.targetNamespace = builder.targetNamespace;
        this.nsAlias = builder.nsAlias;
        this.createRootElement = builder.createRootElement;
        this.name = builder.name;
        this.attributesQualified = builder.attributesQualified;
        this.includeOnlyUsedTypes = builder.includeOnlyUsedTypes;
        this.validateXsdSchema = builder.validateXsdSchema;
        this.typeMapping = builder.typeMapping;
        this.ignoreUnknownFormats = builder.ignoreUnknownFormats;
        this.rootElement = builder.rootElement;
        this.itemNameMapper = builder.itemNameMapper;
        this.unwrapArrays = builder.unwrapArrays;
    }
}
