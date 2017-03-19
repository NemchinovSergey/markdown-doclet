/*
 * Copyright 2013-2016 Raffael Herzog, Marko Umek
 *
 * This file is part of pegdown-doclet.
 *
 * pegdown-doclet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pegdown-doclet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with pegdown-doclet.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package ch.raffael.doclets.pegdown.mdtaglet.argval;

import ch.raffael.doclets.pegdown.mdtaglet.MarkdownTaglet;

import java.util.List;

/**
 * ArgumentListPredicate is a Predicate Functor for {@link PredefinedArgumentValidators#argumentTypesValidator(String, ArgumentListPredicate)}.
 *
 * @see MarkdownTaglet#getArgumentValidator()
 * @see PredefinedArgumentValidators#argumentTypesValidator(String, ArgumentListPredicate)
 */
public interface ArgumentListPredicate {

    /**
     * # Test if the argument list is acceptable/valid or not.
     *
     * @param argumentList the argument list
     * @return {@code true} if valid, otherwise {@code false}
     */
    boolean test(List<String> argumentList);
}
