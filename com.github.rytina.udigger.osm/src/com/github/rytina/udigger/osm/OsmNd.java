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
 * A representation of the model object '<em><b>Nd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.OsmNd#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNd()
 * @model extendedMetaData="name='osm_nd' kind='empty'"
 * @generated
 */
public interface OsmNd extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #isSetRef()
	 * @see #unsetRef()
	 * @see #setRef(long)
	 * @see com.github.rytina.udigger.osm.OsmPackage#getOsmNd_Ref()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRef();

	/**
	 * Sets the value of the '{@link com.github.rytina.udigger.osm.OsmNd#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #isSetRef()
	 * @see #unsetRef()
	 * @see #getRef()
	 * @generated
	 */
	void setRef(long value);

	/**
	 * Unsets the value of the '{@link com.github.rytina.udigger.osm.OsmNd#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRef()
	 * @see #getRef()
	 * @see #setRef(long)
	 * @generated
	 */
	void unsetRef();

	/**
	 * Returns whether the value of the '{@link com.github.rytina.udigger.osm.OsmNd#getRef <em>Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref</em>' attribute is set.
	 * @see #unsetRef()
	 * @see #getRef()
	 * @see #setRef(long)
	 * @generated
	 */
	boolean isSetRef();

} // OsmNd
