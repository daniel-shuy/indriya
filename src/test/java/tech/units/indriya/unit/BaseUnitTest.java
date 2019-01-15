/*
 * Units of Measurement Reference Implementation
 * Copyright (c) 2005-2019, Units of Measurement project.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-385, Indriya nor the names of their contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tech.units.indriya.unit;

import javax.measure.Dimension;

import org.junit.jupiter.api.Test;

import tech.units.indriya.AbstractConverter;
import tech.units.indriya.AbstractUnit;

import tech.units.indriya.quantity.QuantityDimension;
import tech.units.indriya.unit.BaseUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Werner Keil
 */
public class BaseUnitTest {

  private static final String A_SYMBOL = "a";
  private static final String OTHER_SYMBOL = "o";
  private static final String A_NAME = "name";
  private static final String OTHER_NAME = "other name";
  private static final Dimension A_DIMENSION = QuantityDimension.LENGTH;
  private static final Dimension OTHER_DIMENSION = QuantityDimension.MASS;

  /**
   * Verifies that a base unit created using a symbol only has the symbol wired correctly.
   */
  @Test
  public void baseUnitWithSymbolOnlyHasSymbolWiredCorrectly() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertEquals(A_SYMBOL, unit.getSymbol());
  }

  /**
   * Verifies that a base unit created using a symbol only has no name.
   */
  @Test
  public void baseUnitWithSymbolOnlyHasNoName() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertNull(unit.getName());
  }

  /**
   * Verifies that a base unit created using a symbol only has no dimension.
   */
  @Test
  public void baseUnitWithSymbolOnlyHasNoDimension() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertEquals(QuantityDimension.NONE, unit.getDimension());
  }

  /**
   * Verifies that a base unit created using a symbol and a name has the symbol wired correctly.
   */
  @Test
  public void baseUnitWithSymbolAndNameHasSymbolWiredCorrectly() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_NAME);
    assertEquals(A_SYMBOL, unit.getSymbol());
  }

  /**
   * Verifies that a base unit created using a symbol and a name has the name wired correctly.
   */
  @Test
  public void baseUnitWithSymbolAndNameHasNameWiredCorrectly() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_NAME);
    assertEquals(A_NAME, unit.getName());
  }

  /**
   * Verifies that a base unit created using a symbol and a name has no dimension.
   */
  @Test
  public void baseUnitWithSymbolAndNameHasNoDimension() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_NAME);
    assertEquals(QuantityDimension.NONE, unit.getDimension());
  }

  /**
   * Verifies that a base unit created using a symbol and a dimension has the symbol wired correctly.
   */
  @Test
  public void baseUnitWithSymbolAndDimensionHasSymbolWiredCorrectly() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    assertEquals(A_SYMBOL, unit.getSymbol());
  }

  /**
   * Verifies that a base unit created using a symbol and a dimension has no name.
   */
  @Test
  public void baseUnitWithSymbolAndDimensionHasNoName() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    assertNull(unit.getName());
  }

  /**
   * Verifies that a base unit created using a symbol and a dimension has the dimension wired correctly.
   */
  @Test
  public void baseUnitWithSymbolAndDimensionHasDimensionWiredCorrectly() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    assertEquals(A_DIMENSION, unit.getDimension());
  }

  /**
   * Verifies that the system unit of a base unit is the unit itself.
   */
  @Test
  public void baseUnitIsItsOwnBaseUnit() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertEquals(unit, unit.getSystemUnit());
  }

  /**
   * Verifies that the system converter of a base unit is the identity.
   */
  @Test
  public void systemConverterIsIdentity() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertEquals(AbstractConverter.IDENTITY, unit.getSystemConverter());
  }

  /**
   * Verifies that a base unit is equal to itself.
   */
  @Test
  public void baseUnitIsEqualToItself() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertEquals(unit, unit);
  }

  /**
   * Verifies that a base unit is equal to another base unit with the same symbol and dimension.
   */
  @Test
  public void baseUnitIsEqualToAnotherBaseUnitWithTheSameSymbolAndDimension() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    assertEquals(unit, otherUnit);
  }

  /**
   * Verifies that a base unit is not equal to another base unit with another symbol.
   */
  @Test
  public void baseUnitIsNotEqualToAnotherBaseUnitWithAnotherSymbol() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(OTHER_SYMBOL, A_DIMENSION);
    assertNotEquals(unit, otherUnit);
  }

  /**
   * Verifies that a base unit is not equal to another base unit with another dimension.
   */
  @Test
  public void baseUnitIsNotEqualToAnotherBaseUnitWithAnotherDimenion() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(A_SYMBOL, OTHER_DIMENSION);
    assertNotEquals(unit, otherUnit);
  }

  /**
   * Verifies that a base unit is equal to another base unit with the same symbol and dimension but another name.
   */
  @Test
  public void baseUnitIsEqualToAnotherBaseUnitWithTheSameSymbolAndDimensionButOtherName() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_NAME);
    AbstractUnit<?> otherUnit = new BaseUnit<>(A_SYMBOL, OTHER_NAME);
    assertEquals(unit, otherUnit);
  }

  /**
   * Verifies that a base unit is not equal to an object of a different type.
   */
  @Test
  public void baseUnitIsNotEqualToAString() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertNotEquals(unit, A_NAME);
  }

  /**
   * Verifies that a base unit is not equal to anull.
   */
  @Test
  public void baseUnitIsNotEqualToNull() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL);
    assertNotEquals(unit, null);
  }

  /**
   * Verifies that a base unit has the same hash code as another base unit with the same symbol and dimension.
   */
  @Test
  public void baseUnitHasTheSameHashCodeAsAnotherBaseUnitWithTheSameSymbolAndDimension() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    assertEquals(unit.hashCode(), otherUnit.hashCode());
  }

  /**
   * Verifies that a base unit has a different hash code if the symbol is different. Note that this isn't a requirement for the hashCode method, but
   * generally a good property to have.
   */
  @Test
  public void baseUnitHasDifferentHashCodeForBaseUnitWithDifferentSymbol() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(OTHER_SYMBOL, A_DIMENSION);
    assertNotEquals(unit.hashCode(), otherUnit.hashCode());
  }
  
  /**
   * Verifies that a base unit has a different hash code if the dimension is different. Note that this isn't a requirement for the hashCode method, but
   * generally a good property to have.
   */
  @Test
  public void baseUnitHasDifferentHashCodeForBaseUnitWithDifferentDimension() {
    AbstractUnit<?> unit = new BaseUnit<>(A_SYMBOL, A_DIMENSION);
    AbstractUnit<?> otherUnit = new BaseUnit<>(A_SYMBOL, OTHER_SYMBOL);
    assertNotEquals(unit.hashCode(), otherUnit.hashCode());
  }
}