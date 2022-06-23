/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Model tests for TestResponseBody
 */
public class TestResponseBodyTest {

    @Test
    void objectWithAllFieldsIsValid() throws IOException {
        final JsonObject valid = validObject();

        assertThatObjectIsValid(valid);
    }

    @Test
    void objectWithMissingRequiredFieldIsInvalid() throws IOException {
        final JsonObject valid = validObject();
        valid.remove("requiredField");

        assertThatObjectIsInvalid(valid, "The required field `requiredField` is not found in the JSON string");
    }

    @Test
    void objectWithNullRequiredFieldIsValid() throws IOException {
        final JsonObject valid = validObject();
        valid.add("requiredField", JsonNull.INSTANCE);

        assertThatObjectIsInvalid(valid, "Expected the field `requiredField` to be a primitive type in the JSON string but got `null`");
    }

    @Test
    void objectWithMissingRequiredNullableFieldIsInvalid() throws IOException {
        final JsonObject valid = validObject();
        valid.remove("requiredNullableField");

        assertThatObjectIsInvalid(valid, "The required field `requiredNullableField` is not found in the JSON string");
    }

    void assertThatObjectIsValid(JsonObject object) {
        Assertions.assertDoesNotThrow(() -> TestResponseBody.validateJsonObject(object));
    }

    void assertThatObjectIsInvalid(JsonObject object, String expectedMessage) {
        try {
            TestResponseBody.validateJsonObject(object);
        } catch (Exception e) {
            Assertions.assertInstanceOf(IllegalArgumentException.class, e);
            final String actualMessage = e.getMessage();
            Assertions.assertTrue(
                actualMessage.startsWith(expectedMessage),

                String.format("Expected [%s] to start with [%s]", actualMessage, expectedMessage)
            );
            return;
        }
        throw new IllegalStateException("Expected object to be invalid but is valid");
    }

    private JsonObject validObject() {
        final JsonObject object = new JsonObject();
        object.add("requiredField", new JsonPrimitive(""));
        object.add("requiredNullableField", new JsonPrimitive(""));
        object.add("optionalField", new JsonPrimitive(""));
        object.add("optionalNullableField", new JsonPrimitive(""));
        object.add("requiredArrayField", new JsonArray());
        object.add("requiredNullableArrayField", new JsonArray());
        object.add("optionalArrayField", new JsonArray());
        object.add("optionalNullableArrayField", new JsonArray());
        object.add("requiredObjectField", new JsonObject());
        object.add("requiredNullableObjectField", new JsonObject());
        object.add("optionalObjectField", new JsonObject());
        object.add("nullableObjectField", new JsonObject());
        return object;
    }
}
