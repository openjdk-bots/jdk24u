/*
 * Copyright (c) 2006, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 6405175 6487891
 * @summary Tests BoxLayout encoding
 * @run main/othervm javax_swing_BoxLayout
 * @author Sergey Malenkov
 */

import javax.swing.BoxLayout;
import javax.swing.JLabel;

public final class javax_swing_BoxLayout extends AbstractTest<BoxLayout> {
    public static void main(String[] args) {
        new javax_swing_BoxLayout().test();
    }

    protected BoxLayout getObject() {
        return new BoxLayout(new JLabel("TEST"), BoxLayout.LINE_AXIS);
    }

    protected BoxLayout getAnotherObject() {
        return null; // TODO: could not update property
        // return new BoxLayout(new JPanel(), BoxLayout.X_AXIS);
    }
}
