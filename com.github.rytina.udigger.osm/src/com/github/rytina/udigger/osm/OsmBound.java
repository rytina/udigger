/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmBound#getBox <em>Box</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmBound#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmBound()
 * @model extendedMetaData="name='osm_bound' kind='empty'"
 * @generated
 */
public interface OsmBound extends EObject {
	/**
	 * Returns the value of the '<em><b>Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' attribute.
	 * @see #setBox(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmBound_Box()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='box' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBox();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmBound#getBox <em>Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' attribute.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmBound_Origin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmBound#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

} // OsmBound
