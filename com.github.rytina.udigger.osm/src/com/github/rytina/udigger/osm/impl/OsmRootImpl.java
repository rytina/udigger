/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm.impl;

import com.github.rytina.udigger.osm.OsmBound;
import com.github.rytina.udigger.osm.OsmNode;
import com.github.rytina.udigger.osm.OsmPackage;
import com.github.rytina.udigger.osm.OsmRelation;
import com.github.rytina.udigger.osm.OsmRoot;
import com.github.rytina.udigger.osm.OsmWay;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getWay <em>Way</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.github.rytina.udigger.osm.impl.OsmRootImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsmRootImpl extends EObjectImpl implements OsmRoot {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected OsmBound bound;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected String generator = GENERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsmRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.OSM_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmBound getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(OsmBound newBound, NotificationChain msgs) {
		OsmBound oldBound = bound;
		bound = newBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ROOT__BOUND, oldBound, newBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(OsmBound newBound) {
		if (newBound != bound) {
			NotificationChain msgs = null;
			if (bound != null)
				msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OsmPackage.OSM_ROOT__BOUND, null, msgs);
			if (newBound != null)
				msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OsmPackage.OSM_ROOT__BOUND, null, msgs);
			msgs = basicSetBound(newBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ROOT__BOUND, newBound, newBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OsmPackage.OSM_ROOT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsmNode> getNode() {
		return getGroup().list(OsmPackage.Literals.OSM_ROOT__NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsmRelation> getRelation() {
		return getGroup().list(OsmPackage.Literals.OSM_ROOT__RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsmWay> getWay() {
		return getGroup().list(OsmPackage.Literals.OSM_ROOT__WAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(String newGenerator) {
		String oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ROOT__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(BigDecimal newVersion) {
		BigDecimal oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.OSM_ROOT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsmPackage.OSM_ROOT__BOUND:
				return basicSetBound(null, msgs);
			case OsmPackage.OSM_ROOT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM_ROOT__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM_ROOT__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case OsmPackage.OSM_ROOT__WAY:
				return ((InternalEList<?>)getWay()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmPackage.OSM_ROOT__BOUND:
				return getBound();
			case OsmPackage.OSM_ROOT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OsmPackage.OSM_ROOT__NODE:
				return getNode();
			case OsmPackage.OSM_ROOT__RELATION:
				return getRelation();
			case OsmPackage.OSM_ROOT__WAY:
				return getWay();
			case OsmPackage.OSM_ROOT__GENERATOR:
				return getGenerator();
			case OsmPackage.OSM_ROOT__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsmPackage.OSM_ROOT__BOUND:
				setBound((OsmBound)newValue);
				return;
			case OsmPackage.OSM_ROOT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OsmPackage.OSM_ROOT__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends OsmNode>)newValue);
				return;
			case OsmPackage.OSM_ROOT__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends OsmRelation>)newValue);
				return;
			case OsmPackage.OSM_ROOT__WAY:
				getWay().clear();
				getWay().addAll((Collection<? extends OsmWay>)newValue);
				return;
			case OsmPackage.OSM_ROOT__GENERATOR:
				setGenerator((String)newValue);
				return;
			case OsmPackage.OSM_ROOT__VERSION:
				setVersion((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OsmPackage.OSM_ROOT__BOUND:
				setBound((OsmBound)null);
				return;
			case OsmPackage.OSM_ROOT__GROUP:
				getGroup().clear();
				return;
			case OsmPackage.OSM_ROOT__NODE:
				getNode().clear();
				return;
			case OsmPackage.OSM_ROOT__RELATION:
				getRelation().clear();
				return;
			case OsmPackage.OSM_ROOT__WAY:
				getWay().clear();
				return;
			case OsmPackage.OSM_ROOT__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case OsmPackage.OSM_ROOT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OsmPackage.OSM_ROOT__BOUND:
				return bound != null;
			case OsmPackage.OSM_ROOT__GROUP:
				return group != null && !group.isEmpty();
			case OsmPackage.OSM_ROOT__NODE:
				return !getNode().isEmpty();
			case OsmPackage.OSM_ROOT__RELATION:
				return !getRelation().isEmpty();
			case OsmPackage.OSM_ROOT__WAY:
				return !getWay().isEmpty();
			case OsmPackage.OSM_ROOT__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
			case OsmPackage.OSM_ROOT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", generator: ");
		result.append(generator);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OsmRootImpl
