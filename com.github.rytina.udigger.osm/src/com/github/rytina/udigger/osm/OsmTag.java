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
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmTag#getK <em>K</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.OsmTag#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmTag()
 * @model extendedMetaData="name='osm_tag' kind='empty'"
 * @generated
 */
public interface OsmTag extends EObject {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmTag_K()
	 * @model dataType="com.github.rytina.udigger.osm.OsmTagkey" required="true"
	 *        extendedMetaData="kind='attribute' name='k' namespace='##targetNamespace'"
	 * @generated
	 */
	String getK();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmTag#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(String value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(String)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmTag_V()
	 * @model dataType="com.github.rytina.udigger.osm.OsmTagvalue" required="true"
	 *        extendedMetaData="kind='attribute' name='v' namespace='##targetNamespace'"
	 * @generated
	 */
	String getV();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmTag#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(String value);

} // OsmTag
