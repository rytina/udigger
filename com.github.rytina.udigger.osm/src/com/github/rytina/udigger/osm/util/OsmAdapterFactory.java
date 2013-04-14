/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm.util;

import com.github.rytina.udigger.osm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.rytina.udigger.osm.OsmPackage
 * @generated
 */
public class OsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsmSwitch<Adapter> modelSwitch =
		new OsmSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseOsmBound(OsmBound object) {
				return createOsmBoundAdapter();
			}
			@Override
			public Adapter caseOsmMember(OsmMember object) {
				return createOsmMemberAdapter();
			}
			@Override
			public Adapter caseOsmNd(OsmNd object) {
				return createOsmNdAdapter();
			}
			@Override
			public Adapter caseOsmNode(OsmNode object) {
				return createOsmNodeAdapter();
			}
			@Override
			public Adapter caseOsmRelation(OsmRelation object) {
				return createOsmRelationAdapter();
			}
			@Override
			public Adapter caseOsmRoot(OsmRoot object) {
				return createOsmRootAdapter();
			}
			@Override
			public Adapter caseOsmTag(OsmTag object) {
				return createOsmTagAdapter();
			}
			@Override
			public Adapter caseOsmWay(OsmWay object) {
				return createOsmWayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmBound
	 * @generated
	 */
	public Adapter createOsmBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmMember
	 * @generated
	 */
	public Adapter createOsmMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmNd <em>Nd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmNd
	 * @generated
	 */
	public Adapter createOsmNdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmNode
	 * @generated
	 */
	public Adapter createOsmNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmRelation
	 * @generated
	 */
	public Adapter createOsmRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmRoot
	 * @generated
	 */
	public Adapter createOsmRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmTag
	 * @generated
	 */
	public Adapter createOsmTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.rytina.udigger.osm.OsmWay <em>Way</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.rytina.udigger.osm.OsmWay
	 * @generated
	 */
	public Adapter createOsmWayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OsmAdapterFactory
