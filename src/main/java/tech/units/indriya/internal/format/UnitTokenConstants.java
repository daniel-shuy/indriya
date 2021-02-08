/*
 * Units of Measurement Reference Implementation
 * Copyright (c) 2005-2021, Jean-Marie Dautelle, Werner Keil, Otavio Santana.
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
/* Generated By:JavaCC: Do not edit this line. UnitTokenConstants.java */
package tech.units.indriya.internal.format;

/**
 * Token literal values and constants. Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface UnitTokenConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DIGIT = 1;
  /** RegularExpression Id. */
  int SUPERSCRIPT_DIGIT = 2;
  /** RegularExpression Id. */
  int INITIAL_CHAR = 3;
  /** RegularExpression Id. */
  int EXTENDED_CHAR = 4;
  /** RegularExpression Id. */
  int PLUS = 5;
  /** RegularExpression Id. */
  int MINUS = 6;
  /** RegularExpression Id. */
  int ASTERISK = 7;
  /** RegularExpression Id. */
  int MIDDLE_DOT = 8;
  /** RegularExpression Id. */
  int SOLIDUS = 9;
  /** RegularExpression Id. */
  int CARET = 10;
  /** RegularExpression Id. */
  int COLON = 11;
  /** RegularExpression Id. */
  int OPEN_PAREN = 12;
  /** RegularExpression Id. */
  int CLOSE_PAREN = 13;
  /** RegularExpression Id. */
  int INTEGER = 14;
  /** RegularExpression Id. */
  int SUPERSCRIPT_INTEGER = 15;
  /** RegularExpression Id. */
  int FLOATING_POINT = 16;
  /** RegularExpression Id. */
  int LOG = 17;
  /** RegularExpression Id. */
  int NAT_LOG = 18;
  /** RegularExpression Id. */
  int E = 19;
  /** RegularExpression Id. */
  int UNIT_IDENTIFIER = 20;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = { "<EOF>", "<DIGIT>", "<SUPERSCRIPT_DIGIT>", "<INITIAL_CHAR>", "<EXTENDED_CHAR>", "\"+\"", "\"-\"", "\"*\"", "\"\\u00b7\"",
      "\"/\"", "\"^\"", "\":\"", "\"(\"", "\")\"", "<INTEGER>", "<SUPERSCRIPT_INTEGER>", "<FLOATING_POINT>", "<LOG>", "<NAT_LOG>", "\"e\"",
      "<UNIT_IDENTIFIER>", };

}
