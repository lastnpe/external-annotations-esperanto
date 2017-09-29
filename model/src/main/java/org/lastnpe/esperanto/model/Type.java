/*
 * Copyright (c) 2017 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.lastnpe.esperanto.model;

/**
 * Java Type.
 *
 * Intentionally closely mimics the APIs of but <b>*NOT*</b> using/linked to any
 * real {@link Class} or {@link java.lang.reflect.Type} and all, because the purpose
 * of this is to be able to be used without any class loading and the like.
 *
 * @author Michael Vorburger.ch
 */
public interface Type extends AnnotatedElement {

    String getTypeName();

}
