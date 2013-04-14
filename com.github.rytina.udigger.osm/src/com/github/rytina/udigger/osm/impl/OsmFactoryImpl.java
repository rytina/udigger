/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm.impl;

import com.github.rytina.udigger.osm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmFactoryImpl extends EFactoryImpl implements OsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsmFactory init() {
		try {
			OsmFactory theOsmFactory = (OsmFactory)EPackage.Registry.INSTANCE.getEFactory("file:/C:/Users/rytina/Workspaces/WS_GREMLIN/gremlin/src/gremlin/osm.xsd"); 
			if (theOsmFactory != null) {
				return theOsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsmPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OsmPackage.OSM_BOUND: return createOsmBound();
			case OsmPackage.OSM_MEMBER: return createOsmMember();
			case OsmPackage.OSM_ND: return createOsmNd();
			case OsmPackage.OSM_NODE: return createOsmNode();
			case OsmPackage.OSM_RELATION: return createOsmRelation();
			case OsmPackage.OSM_ROOT: return createOsmRoot();
			case OsmPackage.OSM_TAG: return createOsmTag();
			case OsmPackage.OSM_WAY: return createOsmWay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OsmPackage.OSM_MEMBERTYPE:
				return createOsmMembertypeFromString(eDataType, initialValue);
			case OsmPackage.OSM_MEMBERTYPE_OBJECT:
				return createOsmMembertypeObjectFromString(eDataType, initialValue);
			case OsmPackage.OSM_ROLE:
				return createOsmRoleFromString(eDataType, initialValue);
			case OsmPackage.OSM_TAGKEY:
				return createOsmTagkeyFromString(eDataType, initialValue);
			case OsmPackage.OSM_TAGVALUE:
				return createOsmTagvalueFromString(eDataType, initialValue);
			case OsmPackage.OSM_USER:
				return createOsmUserFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OsmPackage.OSM_MEMBERTYPE:
				return convertOsmMembertypeToString(eDataType, instanceValue);
			case OsmPackage.OSM_MEMBERTYPE_OBJECT:
				return convertOsmMembertypeObjectToString(eDataType, instanceValue);
			case OsmPackage.OSM_ROLE:
				return convertOsmRoleToString(eDataType, instanceValue);
			case OsmPackage.OSM_TAGKEY:
				return convertOsmTagkeyToString(eDataType, instanceValue);
			case OsmPackage.OSM_TAGVALUE:
				return convertOsmTagvalueToString(eDataType, instanceValue);
			case OsmPackage.OSM_USER:
				return convertOsmUserToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmBound createOsmBound() {
		OsmBoundImpl osmBound = new OsmBoundImpl();
		return osmBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmMember createOsmMember() {
		OsmMemberImpl osmMember = new OsmMemberImpl();
		return osmMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmNd createOsmNd() {
		OsmNdImpl osmNd = new OsmNdImpl();
		return osmNd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmNode createOsmNode() {
		OsmNodeImpl osmNode = new OsmNodeImpl();
		return osmNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmRelation createOsmRelation() {
		OsmRelationImpl osmRelation = new OsmRelationImpl();
		return osmRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmRoot createOsmRoot() {
		OsmRootImpl osmRoot = new OsmRootImpl();
		return osmRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmTag createOsmTag() {
		OsmTagImpl osmTag = new OsmTagImpl();
		return osmTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmWay createOsmWay() {
		OsmWayImpl osmWay = new OsmWayImpl();
		return osmWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmMembertype createOsmMembertypeFromString(EDataType eDataType, String initialValue) {
		OsmMembertype result = OsmMembertype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmMembertypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmMembertype createOsmMembertypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOsmMembertypeFromString(OsmPackage.Literals.OSM_MEMBERTYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmMembertypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOsmMembertypeToString(OsmPackage.Literals.OSM_MEMBERTYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOsmRoleFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmRoleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOsmTagkeyFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmTagkeyToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOsmTagvalueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmTagvalueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOsmUserFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsmUserToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmPackage getOsmPackage() {
		return (OsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsmPackage getPackage() {
		return OsmPackage.eINSTANCE;
	}

} //OsmFactoryImpl
